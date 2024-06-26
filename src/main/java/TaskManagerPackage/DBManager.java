/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TaskManagerPackage;

import DerbyDatabasePackage.*;

/**
 *
 * @author Caleb
 */
public class DBManager {

    //default connection credentials to DB
    private static final String USER_NAME = "pdc";
    private static final String PASSWORD = "pdc";
    private static final String DB_URL = "jdbc:derby:TaskManagerDatabase;create=true";

    TaskManagerSchemaManager schema = new TaskManagerSchemaManager();
    TaskManagerRepository repo = new TaskManagerRepository(USER_NAME, PASSWORD, DB_URL);
    TaskManagerConnectionManager connManager = new TaskManagerConnectionManager();

    //to handle DB actions
    //to replace FileManager and tasks.txt
    //Dependency Injection
    public DBManager(Repository repo, ConnectionManager connManager, TaskManagerSchemaManager schema) {
        this.schema = schema;
        this.repo = (TaskManagerRepository) repo;
        this.connManager = (TaskManagerConnectionManager) connManager;
    }

    public DBManager() {
    }
}
