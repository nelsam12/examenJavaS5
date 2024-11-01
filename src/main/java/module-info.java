module com.example {
    requires javafx.controls;
    requires javafx.fxml;
    requires lombok;
    requires java.persistence;
    requires java.sql;
    requires org.hibernate.orm.core;

    opens com.example to javafx.fxml;
    opens com.example.entities to org.hibernate.orm.core;
    opens com.example.controllers to javafx.fxml;
    
    exports com.example.entities;
    exports com.example;
}
