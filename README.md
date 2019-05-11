## Command Line Java Application With Gradle

We want to create a java application (runnable as jar) which interacts
with the user via command line.

#### Structure of the project
We use gradle init script to lay out the initial scaffolding of the project.

```
gradle init --type java-application                                                                 sudipbhandari@sysadm-Latitude-5480

Select build script DSL:
  1: groovy
  2: kotlin
Enter selection (default: groovy) [1..2] 1

Select test framework:
  1: junit
  2: testng
  3: spock
Enter selection (default: junit) [1..3] 1

Project name (default: game): hangman
Source package (default: hangman): 
```

We can choose either (groovy or Kotlin as DSL), select a testing
framework and assign the main package name. 

---

In order to be able to run as java application, we apply `application` 
plugin.

```
plugins {
    // Apply the java plugin to add support for Java
    id 'java'

    // Apply the application plugin to add support for building an application
    id 'application'
}
```

Adding the main class:

```
// Define the main class for the application
mainClassName = 'hangman.HangmanApplication'
```

In order to take input from the console (command line)

```dtd
run{
    standardInput = System.in
}
```

### Running the application

Since we have applied java-application plugin we can `run` using gradle.

```dtd
gradle run
```

This gives an annoying progress bar which  can be disabled using:

``gradle run --console=plain``

For Convenience, Let's create an executable which does just this:

#### run
```
#!bin/bash
./gradlew run --console=plain
```

And make it executable:
```sudo chmod +x run```

Finally,

```dtd
./run                                                                                       sudipbhandari@sysadm-Latitude-5480
> Task :compileJava UP-TO-DATE
> Task :processResources NO-SOURCE
> Task :classes UP-TO-DATE
Hello

> Task :run
You entered Hello Please enter Exit to exit from this
Hi
You entered Hi Please enter Exit to exit from this
Exit

BUILD SUCCESSFUL in 9s
2 actionable tasks: 1 executed, 1 up-to-date
------------------------------------------------------------

```

