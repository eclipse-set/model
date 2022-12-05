# Build instructions

As the requirements for local development and production deployments are different, this document contains two sets of instructions. First, instructions on how to work on the component locally using the Eclipse IDE (e.g. for development) and secondly how to do a full production build locally via Maven.

## Prerequisites

- A Java Development Kit 17 (or higher)
- Maven (3.8+) 
- Eclipse IDE (2022-06+)

# Development

This is the recommended way to build and debug for development. 

1. Create a new workspace in the Eclipse IDE
2. Import projects from `java/` via File -> Import -> Existing Projects into Workspace
3. Import the Checkstyle configuration from the SET repository (`releng/eclipse/CheckstyleEclipse.xml`) via Window -> Preferences -> Checkstyle
4. Build all projects

As the model itself does not produce executable content, there is nothing to run. During development either a simple new project can be added (e.g. for testing model changes) or the entire toolbox application can also be imported into the same workspace. 

# Production build

This is the recommended way if you want a production-style build. This is also what we have implemented on the Jenkins instance. 

1. Build via maven: `mvn clean verify`

The p2 site for the model is now located in `java\bundles\org.eclipse.set.model.releng.repository\target\repository`. 