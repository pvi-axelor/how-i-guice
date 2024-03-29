### Guice 
----
Guice is a lighweight java framework used for dependency injection.
____
This repo is a reflection of my learning and testing journey of this framework.

Each folder in here is a project on its own, with Main file being commented out to avoid any accidental runs.

Each folder can be run with `gradle run`, or by importing it in eclipse, as the `build.gradle` file contains the `id 'eclipse'` plugin.

----

#### Features tried so far...

* Annotations
    * @Inject
    * @Named
    * @Singleton
    * @BuildAnnotation (deprecated)
    * @Qualifier (replacement for @BuildAnnotation)
    * @Target
    * @Retention
    * @ImplementedBy
    * @Provides

* Injection
    * Field injection (shouldn't be used!)
    * Method injection
    * Constructor injection
    * Automatic injection
    * Optional binding

* Binding
    * Linked binding
    * Concrete class binding
    * Constant bining
    * Named/Annotated binding
    * Provider binding


----

#### Yet to try...

* MultiBind
* On-Demand Injection
* JPA with guice

