

# ConnectorType

Represents a connector type supported by the API

## oneOf schemas
* [ConnectorTypeAllOf](ConnectorTypeAllOf.md)
* [ObjectReference](ObjectReference.md)

## Example
```java
// Import classes:
import com.openshift.cloud.api.connector.models.ConnectorType;
import com.openshift.cloud.api.connector.models.ConnectorTypeAllOf;
import com.openshift.cloud.api.connector.models.ObjectReference;

public class Example {
    public static void main(String[] args) {
        ConnectorType exampleConnectorType = new ConnectorType();

        // create a new ConnectorTypeAllOf
        ConnectorTypeAllOf exampleConnectorTypeAllOf = new ConnectorTypeAllOf();
        // set ConnectorType to ConnectorTypeAllOf
        exampleConnectorType.setActualInstance(exampleConnectorTypeAllOf);
        // to get back the ConnectorTypeAllOf set earlier
        ConnectorTypeAllOf testConnectorTypeAllOf = (ConnectorTypeAllOf) exampleConnectorType.getActualInstance();

        // create a new ObjectReference
        ObjectReference exampleObjectReference = new ObjectReference();
        // set ConnectorType to ObjectReference
        exampleConnectorType.setActualInstance(exampleObjectReference);
        // to get back the ObjectReference set earlier
        ObjectReference testObjectReference = (ObjectReference) exampleConnectorType.getActualInstance();
    }
}
```


