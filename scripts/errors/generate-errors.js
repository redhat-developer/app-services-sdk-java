const fs = require("fs");
const { cwd } = require("process");
const apis = require(cwd() + "/.errors/index.js");

console.log("Generating errors sdks");

for (api in apis) {
  console.log("Generating error SDK for " + api);
  apiJson = apis[api].definition;
  apiFileLocation = apis[api].file;

  if (!apiJson || !apiJson.items) {
    console.log("invalid error file detected", apiJson);
    exit(1);
  }

  template = fs.readFileSync(__dirname + "/ApiErrorType.java", "utf8");

  stringBuffer = ``;

  for (i = 0; i < apiJson.items.length - 1; i++) {
    errorType = apiJson.items[i];
    stringBuffer += `  /** ${errorType.reason}*/\n`;
    stringBuffer += `  ERROR_${errorType.id}("${errorType.code}"), \n\n`;
  }
  errorType = apiJson.items[ apiJson.items.length - 1];
  stringBuffer += `  /** ${errorType.reason}*/\n`;
  stringBuffer += `  ERROR_${errorType.id}("${errorType.code}"); \n\n`;

  stringBuffer = template.replace("PLACEHOLDER", stringBuffer);
  stringBuffer = stringBuffer.replace("PACKAGE_REPLACE", api);

  fs.writeFileSync(cwd() + "/" + apiFileLocation, stringBuffer, {
    encoding: "utf8",
  });
  console.log(`Sucessfully generated ${api} error definitions`);
}
