# Java W3Schools Coding

Hands-on practice for the [W3Schools Java Tutorial](https://www.w3schools.com/java/). Every example and exercise here is written by hand, one topic at a time, to build a solid base in Java, from syntax and OOP to collections, file I/O, and concurrency.

## Tech Stack

- Java 27 (OpenJDK)
- Maven
- IntelliJ IDEA

## Project Structure

The code follows the W3Schools sidebar: **section → topic → lesson**.

```
src/main/java/org/example/
├── s01_basics/            Syntax, variables, data types, operators, strings, control flow, arrays
├── s02_methods/           Methods, parameters, overloading, scope, recursion
├── s03_classes/           OOP: classes, constructors, encapsulation, inheritance, polymorphism, interfaces, enums
├── s04_errors/            Errors, debugging, exceptions, try-with-resources
├── s05_filehandling/      Create, write, read, and delete files
├── s06_iostreams/         FileInputStream, FileOutputStream, BufferedReader, BufferedWriter
├── s07_datastructures/    Collections: List, Set, Map, Iterator, algorithms
├── s08_advanced/          Wrapper classes, generics, annotations, regex, threads, lambdas, sorting
├── s09_reference/         Hands-on practice with the standard-library reference pages
└── s10_howtos/            Classic exercises: numbers, strings, arrays, math, loops
```

Each topic is its own package, for example:

```
s03_classes/
├── t08_modifiers/
│   ├── AccessModifiers.java
│   └── NonAccessModifiers.java
└── t11_inheritance/
    └── Inheritance.java      ← plus any helper classes (e.g. Vehicle, Car) for that lesson
```

**Conventions**

- `sNN_` and `tNN_` prefixes keep sections and topics in tutorial order.
- Every lesson class has its own `main` method, so each one runs by itself.
- Each class's Javadoc links to the W3Schools page it covers.
- `*Challenge` classes hold the W3Schools Code Challenge exercises.
- Class names that would shadow JDK types get a suffix (`ArrayListDemo`, `CollectionsOverview`, `ListInterface`), so imports like `java.util.ArrayList` still work.

## How to Run

**IntelliJ IDEA:** open any class and click the ▶ icon next to `main`.

**Command line** (single file, no build needed):

```bash
java src/main/java/org/example/s01_basics/t01_getstarted/HelloWorld.java
```

**With Maven:**

```bash
mvn compile
java -cp target/classes org.example.s01_basics.t01_getstarted.HelloWorld
```

## Progress

Legend: ⬜ Not started · 🟨 In progress · ✅ Done

### 1. Java Tutorial (Basics)

| # | Topic | Lessons | Status |
|---|-------|---------|--------|
| 01 | [Get Started](https://www.w3schools.com/java/java_getstarted.asp) | [`HelloWorld`](src/main/java/org/example/s01_basics/t01_getstarted/HelloWorld.java) | ⬜ |
| 02 | [Syntax](https://www.w3schools.com/java/java_syntax.asp) | [`Syntax`](src/main/java/org/example/s01_basics/t02_syntax/Syntax.java), [`Statements`](src/main/java/org/example/s01_basics/t02_syntax/Statements.java), [`SyntaxChallenge`](src/main/java/org/example/s01_basics/t02_syntax/SyntaxChallenge.java) | ⬜ |
| 03 | [Output](https://www.w3schools.com/java/java_output.asp) | [`PrintText`](src/main/java/org/example/s01_basics/t03_output/PrintText.java), [`PrintNumbers`](src/main/java/org/example/s01_basics/t03_output/PrintNumbers.java), [`OutputChallenge`](src/main/java/org/example/s01_basics/t03_output/OutputChallenge.java) | ⬜ |
| 04 | [Comments](https://www.w3schools.com/java/java_comments.asp) | [`Comments`](src/main/java/org/example/s01_basics/t04_comments/Comments.java) | ⬜ |
| 05 | [Variables](https://www.w3schools.com/java/java_variables.asp) | [`Variables`](src/main/java/org/example/s01_basics/t05_variables/Variables.java), [`PrintVariables`](src/main/java/org/example/s01_basics/t05_variables/PrintVariables.java), [`MultipleVariables`](src/main/java/org/example/s01_basics/t05_variables/MultipleVariables.java), [`Identifiers`](src/main/java/org/example/s01_basics/t05_variables/Identifiers.java), [`Constants`](src/main/java/org/example/s01_basics/t05_variables/Constants.java), [`VariablesRealLife`](src/main/java/org/example/s01_basics/t05_variables/VariablesRealLife.java), [`VariablesChallenge`](src/main/java/org/example/s01_basics/t05_variables/VariablesChallenge.java) | ⬜ |
| 06 | [Data Types](https://www.w3schools.com/java/java_data_types.asp) | [`DataTypes`](src/main/java/org/example/s01_basics/t06_datatypes/DataTypes.java), [`Numbers`](src/main/java/org/example/s01_basics/t06_datatypes/Numbers.java), [`BooleanType`](src/main/java/org/example/s01_basics/t06_datatypes/BooleanType.java), [`Characters`](src/main/java/org/example/s01_basics/t06_datatypes/Characters.java), [`DataTypesRealLife`](src/main/java/org/example/s01_basics/t06_datatypes/DataTypesRealLife.java), [`NonPrimitiveTypes`](src/main/java/org/example/s01_basics/t06_datatypes/NonPrimitiveTypes.java), [`VarKeyword`](src/main/java/org/example/s01_basics/t06_datatypes/VarKeyword.java), [`DataTypesChallenge`](src/main/java/org/example/s01_basics/t06_datatypes/DataTypesChallenge.java) | ⬜ |
| 07 | [Type Casting](https://www.w3schools.com/java/java_type_casting.asp) | [`TypeCasting`](src/main/java/org/example/s01_basics/t07_typecasting/TypeCasting.java) | ⬜ |
| 08 | [Operators](https://www.w3schools.com/java/java_operators.asp) | [`Operators`](src/main/java/org/example/s01_basics/t08_operators/Operators.java), [`ArithmeticOperators`](src/main/java/org/example/s01_basics/t08_operators/ArithmeticOperators.java), [`AssignmentOperators`](src/main/java/org/example/s01_basics/t08_operators/AssignmentOperators.java), [`ComparisonOperators`](src/main/java/org/example/s01_basics/t08_operators/ComparisonOperators.java), [`LogicalOperators`](src/main/java/org/example/s01_basics/t08_operators/LogicalOperators.java), [`OperatorPrecedence`](src/main/java/org/example/s01_basics/t08_operators/OperatorPrecedence.java), [`OperatorsChallenge`](src/main/java/org/example/s01_basics/t08_operators/OperatorsChallenge.java) | ⬜ |
| 09 | [Strings](https://www.w3schools.com/java/java_strings.asp) | [`Strings`](src/main/java/org/example/s01_basics/t09_strings/Strings.java), [`Concatenation`](src/main/java/org/example/s01_basics/t09_strings/Concatenation.java), [`NumbersAndStrings`](src/main/java/org/example/s01_basics/t09_strings/NumbersAndStrings.java), [`SpecialCharacters`](src/main/java/org/example/s01_basics/t09_strings/SpecialCharacters.java), [`StringsChallenge`](src/main/java/org/example/s01_basics/t09_strings/StringsChallenge.java) | ⬜ |
| 10 | [Math](https://www.w3schools.com/java/java_math.asp) | [`JavaMath`](src/main/java/org/example/s01_basics/t10_math/JavaMath.java) | ⬜ |
| 11 | [Booleans](https://www.w3schools.com/java/java_booleans.asp) | [`Booleans`](src/main/java/org/example/s01_basics/t11_booleans/Booleans.java), [`BooleansRealLife`](src/main/java/org/example/s01_basics/t11_booleans/BooleansRealLife.java), [`BooleansChallenge`](src/main/java/org/example/s01_basics/t11_booleans/BooleansChallenge.java) | ⬜ |
| 12 | [If...Else](https://www.w3schools.com/java/java_conditions.asp) | [`IfStatement`](src/main/java/org/example/s01_basics/t12_ifelse/IfStatement.java), [`ElseStatement`](src/main/java/org/example/s01_basics/t12_ifelse/ElseStatement.java), [`ElseIf`](src/main/java/org/example/s01_basics/t12_ifelse/ElseIf.java), [`Ternary`](src/main/java/org/example/s01_basics/t12_ifelse/Ternary.java), [`NestedIf`](src/main/java/org/example/s01_basics/t12_ifelse/NestedIf.java), [`IfLogicalOperators`](src/main/java/org/example/s01_basics/t12_ifelse/IfLogicalOperators.java), [`IfElseRealLife`](src/main/java/org/example/s01_basics/t12_ifelse/IfElseRealLife.java), [`IfElseChallenge`](src/main/java/org/example/s01_basics/t12_ifelse/IfElseChallenge.java) | ⬜ |
| 13 | [Switch](https://www.w3schools.com/java/java_switch.asp) | [`Switch`](src/main/java/org/example/s01_basics/t13_switch/Switch.java), [`SwitchChallenge`](src/main/java/org/example/s01_basics/t13_switch/SwitchChallenge.java) | ⬜ |
| 14 | [While Loop](https://www.w3schools.com/java/java_while_loop.asp) | [`WhileLoop`](src/main/java/org/example/s01_basics/t14_whileloop/WhileLoop.java), [`DoWhileLoop`](src/main/java/org/example/s01_basics/t14_whileloop/DoWhileLoop.java), [`WhileLoopRealLife`](src/main/java/org/example/s01_basics/t14_whileloop/WhileLoopRealLife.java), [`WhileLoopChallenge`](src/main/java/org/example/s01_basics/t14_whileloop/WhileLoopChallenge.java) | ⬜ |
| 15 | [For Loop](https://www.w3schools.com/java/java_for_loop.asp) | [`ForLoop`](src/main/java/org/example/s01_basics/t15_forloop/ForLoop.java), [`NestedLoops`](src/main/java/org/example/s01_basics/t15_forloop/NestedLoops.java), [`ForEachLoop`](src/main/java/org/example/s01_basics/t15_forloop/ForEachLoop.java), [`ForLoopRealLife`](src/main/java/org/example/s01_basics/t15_forloop/ForLoopRealLife.java), [`ForLoopChallenge`](src/main/java/org/example/s01_basics/t15_forloop/ForLoopChallenge.java) | ⬜ |
| 16 | [Break/Continue](https://www.w3schools.com/java/java_break.asp) | [`BreakContinue`](src/main/java/org/example/s01_basics/t16_breakcontinue/BreakContinue.java) | ⬜ |
| 17 | [Arrays](https://www.w3schools.com/java/java_arrays.asp) | [`ArrayBasics`](src/main/java/org/example/s01_basics/t17_arrays/ArrayBasics.java), [`LoopThroughArray`](src/main/java/org/example/s01_basics/t17_arrays/LoopThroughArray.java), [`ArraysRealLife`](src/main/java/org/example/s01_basics/t17_arrays/ArraysRealLife.java), [`MultidimensionalArrays`](src/main/java/org/example/s01_basics/t17_arrays/MultidimensionalArrays.java), [`ArraysChallenge`](src/main/java/org/example/s01_basics/t17_arrays/ArraysChallenge.java) | ⬜ |

### 2. Java Methods

| # | Topic | Lessons | Status |
|---|-------|---------|--------|
| 01 | [Methods](https://www.w3schools.com/java/java_methods.asp) | [`Methods`](src/main/java/org/example/s02_methods/t01_methods/Methods.java) | ⬜ |
| 02 | [Method Challenge](https://www.w3schools.com/java/java_challenges_methods.asp) | [`MethodChallenge`](src/main/java/org/example/s02_methods/t02_methodchallenge/MethodChallenge.java) | ⬜ |
| 03 | [Method Parameters](https://www.w3schools.com/java/java_methods_param.asp) | [`Parameters`](src/main/java/org/example/s02_methods/t03_parameters/Parameters.java), [`ReturnValues`](src/main/java/org/example/s02_methods/t03_parameters/ReturnValues.java), [`ParametersChallenge`](src/main/java/org/example/s02_methods/t03_parameters/ParametersChallenge.java) | ⬜ |
| 04 | [Method Overloading](https://www.w3schools.com/java/java_methods_overloading.asp) | [`MethodOverloading`](src/main/java/org/example/s02_methods/t04_overloading/MethodOverloading.java) | ⬜ |
| 05 | [Scope](https://www.w3schools.com/java/java_scope.asp) | [`Scope`](src/main/java/org/example/s02_methods/t05_scope/Scope.java) | ⬜ |
| 06 | [Recursion](https://www.w3schools.com/java/java_recursion.asp) | [`Recursion`](src/main/java/org/example/s02_methods/t06_recursion/Recursion.java) | ⬜ |

### 3. Java Classes (OOP)

| # | Topic | Lessons | Status |
|---|-------|---------|--------|
| 01 | [OOP](https://www.w3schools.com/java/java_oop.asp) | [`OopIntro`](src/main/java/org/example/s03_classes/t01_oop/OopIntro.java) | ⬜ |
| 02 | [Classes/Objects](https://www.w3schools.com/java/java_classes.asp) | [`ClassesObjects`](src/main/java/org/example/s03_classes/t02_classesobjects/ClassesObjects.java) | ⬜ |
| 03 | [Class Attributes](https://www.w3schools.com/java/java_class_attributes.asp) | [`ClassAttributes`](src/main/java/org/example/s03_classes/t03_classattributes/ClassAttributes.java) | ⬜ |
| 04 | [Class Methods](https://www.w3schools.com/java/java_class_methods.asp) | [`ClassMethods`](src/main/java/org/example/s03_classes/t04_classmethods/ClassMethods.java) | ⬜ |
| 05 | [Class Challenge](https://www.w3schools.com/java/java_challenges_class.asp) | [`ClassChallenge`](src/main/java/org/example/s03_classes/t05_classchallenge/ClassChallenge.java) | ⬜ |
| 06 | [Constructors](https://www.w3schools.com/java/java_constructors.asp) | [`Constructors`](src/main/java/org/example/s03_classes/t06_constructors/Constructors.java) | ⬜ |
| 07 | [this Keyword](https://www.w3schools.com/java/java_this.asp) | [`ThisKeyword`](src/main/java/org/example/s03_classes/t07_thiskeyword/ThisKeyword.java) | ⬜ |
| 08 | [Modifiers](https://www.w3schools.com/java/java_modifiers.asp) | [`AccessModifiers`](src/main/java/org/example/s03_classes/t08_modifiers/AccessModifiers.java), [`NonAccessModifiers`](src/main/java/org/example/s03_classes/t08_modifiers/NonAccessModifiers.java) | ⬜ |
| 09 | [Encapsulation](https://www.w3schools.com/java/java_encapsulation.asp) | [`Encapsulation`](src/main/java/org/example/s03_classes/t09_encapsulation/Encapsulation.java) | ⬜ |
| 10 | [Packages / API](https://www.w3schools.com/java/java_packages.asp) | [`Packages`](src/main/java/org/example/s03_classes/t10_packages/Packages.java) | ⬜ |
| 11 | [Inheritance](https://www.w3schools.com/java/java_inheritance.asp) | [`Inheritance`](src/main/java/org/example/s03_classes/t11_inheritance/Inheritance.java) | ⬜ |
| 12 | [Polymorphism](https://www.w3schools.com/java/java_polymorphism.asp) | [`Polymorphism`](src/main/java/org/example/s03_classes/t12_polymorphism/Polymorphism.java) | ⬜ |
| 13 | [super Keyword](https://www.w3schools.com/java/java_super.asp) | [`SuperKeyword`](src/main/java/org/example/s03_classes/t13_superkeyword/SuperKeyword.java) | ⬜ |
| 14 | [Inner Classes](https://www.w3schools.com/java/java_inner_classes.asp) | [`InnerClasses`](src/main/java/org/example/s03_classes/t14_innerclasses/InnerClasses.java) | ⬜ |
| 15 | [Abstraction](https://www.w3schools.com/java/java_abstract.asp) | [`Abstraction`](src/main/java/org/example/s03_classes/t15_abstraction/Abstraction.java) | ⬜ |
| 16 | [Interface](https://www.w3schools.com/java/java_interface.asp) | [`Interfaces`](src/main/java/org/example/s03_classes/t16_interface/Interfaces.java) | ⬜ |
| 17 | [Anonymous](https://www.w3schools.com/java/java_anonymous.asp) | [`AnonymousClasses`](src/main/java/org/example/s03_classes/t17_anonymous/AnonymousClasses.java) | ⬜ |
| 18 | [Enum](https://www.w3schools.com/java/java_enums.asp) | [`Enums`](src/main/java/org/example/s03_classes/t18_enums/Enums.java), [`EnumConstructor`](src/main/java/org/example/s03_classes/t18_enums/EnumConstructor.java) | ⬜ |
| 19 | [User Input](https://www.w3schools.com/java/java_user_input.asp) | [`UserInput`](src/main/java/org/example/s03_classes/t19_userinput/UserInput.java) | ⬜ |
| 20 | [Date](https://www.w3schools.com/java/java_date.asp) | [`DateTime`](src/main/java/org/example/s03_classes/t20_date/DateTime.java) | ⬜ |

### 4. Java Errors

| # | Topic | Lessons | Status |
|---|-------|---------|--------|
| 01 | [Errors](https://www.w3schools.com/java/java_errors.asp) | [`Errors`](src/main/java/org/example/s04_errors/t01_errors/Errors.java) | ⬜ |
| 02 | [Debugging](https://www.w3schools.com/java/java_debugging.asp) | [`Debugging`](src/main/java/org/example/s04_errors/t02_debugging/Debugging.java) | ⬜ |
| 03 | [Exceptions](https://www.w3schools.com/java/java_try_catch.asp) | [`Exceptions`](src/main/java/org/example/s04_errors/t03_exceptions/Exceptions.java) | ⬜ |
| 04 | [Multiple Exceptions](https://www.w3schools.com/java/java_exceptions_multiple.asp) | [`MultipleExceptions`](src/main/java/org/example/s04_errors/t04_multipleexceptions/MultipleExceptions.java) | ⬜ |
| 05 | [try-with-resources](https://www.w3schools.com/java/java_try_catch_resources.asp) | [`TryWithResources`](src/main/java/org/example/s04_errors/t05_trywithresources/TryWithResources.java) | ⬜ |

### 5. Java File Handling

| # | Topic | Lessons | Status |
|---|-------|---------|--------|
| 01 | [Files](https://www.w3schools.com/java/java_files.asp) | [`FilesIntro`](src/main/java/org/example/s05_filehandling/t01_files/FilesIntro.java) | ⬜ |
| 02 | [Create Files](https://www.w3schools.com/java/java_files_create.asp) | [`CreateFile`](src/main/java/org/example/s05_filehandling/t02_createfiles/CreateFile.java) | ⬜ |
| 03 | [Write Files](https://www.w3schools.com/java/java_files_write.asp) | [`WriteToFile`](src/main/java/org/example/s05_filehandling/t03_writefiles/WriteToFile.java) | ⬜ |
| 04 | [Read Files](https://www.w3schools.com/java/java_files_read.asp) | [`ReadFile`](src/main/java/org/example/s05_filehandling/t04_readfiles/ReadFile.java) | ⬜ |
| 05 | [Delete Files](https://www.w3schools.com/java/java_files_delete.asp) | [`DeleteFile`](src/main/java/org/example/s05_filehandling/t05_deletefiles/DeleteFile.java) | ⬜ |

### 6. Java I/O Streams

| # | Topic | Lessons | Status |
|---|-------|---------|--------|
| 01 | [I/O Streams](https://www.w3schools.com/java/java_io_streams.asp) | [`IOStreams`](src/main/java/org/example/s06_iostreams/t01_iostreams/IOStreams.java) | ⬜ |
| 02 | [FileInputStream](https://www.w3schools.com/java/java_fileinputstream.asp) | [`FileInputStreamDemo`](src/main/java/org/example/s06_iostreams/t02_fileinputstream/FileInputStreamDemo.java) | ⬜ |
| 03 | [FileOutputStream](https://www.w3schools.com/java/java_fileoutputstream.asp) | [`FileOutputStreamDemo`](src/main/java/org/example/s06_iostreams/t03_fileoutputstream/FileOutputStreamDemo.java) | ⬜ |
| 04 | [BufferedReader](https://www.w3schools.com/java/java_bufferedreader.asp) | [`BufferedReaderDemo`](src/main/java/org/example/s06_iostreams/t04_bufferedreader/BufferedReaderDemo.java) | ⬜ |
| 05 | [BufferedWriter](https://www.w3schools.com/java/java_bufferedwriter.asp) | [`BufferedWriterDemo`](src/main/java/org/example/s06_iostreams/t05_bufferedwriter/BufferedWriterDemo.java) | ⬜ |

### 7. Java Data Structures

| # | Topic | Lessons | Status |
|---|-------|---------|--------|
| 01 | [Data Structures](https://www.w3schools.com/java/java_data_structures.asp) | [`DataStructures`](src/main/java/org/example/s07_datastructures/t01_datastructures/DataStructures.java) | ⬜ |
| 02 | [Collections](https://www.w3schools.com/java/java_collections.asp) | [`CollectionsOverview`](src/main/java/org/example/s07_datastructures/t02_collections/CollectionsOverview.java) | ⬜ |
| 03 | [List](https://www.w3schools.com/java/java_list.asp) | [`ListInterface`](src/main/java/org/example/s07_datastructures/t03_list/ListInterface.java) | ⬜ |
| 04 | [ArrayList](https://www.w3schools.com/java/java_arraylist.asp) | [`ArrayListDemo`](src/main/java/org/example/s07_datastructures/t04_arraylist/ArrayListDemo.java) | ⬜ |
| 05 | [LinkedList](https://www.w3schools.com/java/java_linkedlist.asp) | [`LinkedListDemo`](src/main/java/org/example/s07_datastructures/t05_linkedlist/LinkedListDemo.java) | ⬜ |
| 06 | [List Sorting](https://www.w3schools.com/java/java_sort_list.asp) | [`ListSorting`](src/main/java/org/example/s07_datastructures/t06_listsorting/ListSorting.java) | ⬜ |
| 07 | [Set](https://www.w3schools.com/java/java_set.asp) | [`SetInterface`](src/main/java/org/example/s07_datastructures/t07_set/SetInterface.java) | ⬜ |
| 08 | [HashSet](https://www.w3schools.com/java/java_hashset.asp) | [`HashSetDemo`](src/main/java/org/example/s07_datastructures/t08_hashset/HashSetDemo.java) | ⬜ |
| 09 | [TreeSet](https://www.w3schools.com/java/java_treeset.asp) | [`TreeSetDemo`](src/main/java/org/example/s07_datastructures/t09_treeset/TreeSetDemo.java) | ⬜ |
| 10 | [LinkedHashSet](https://www.w3schools.com/java/java_linkedhashset.asp) | [`LinkedHashSetDemo`](src/main/java/org/example/s07_datastructures/t10_linkedhashset/LinkedHashSetDemo.java) | ⬜ |
| 11 | [Map](https://www.w3schools.com/java/java_map.asp) | [`MapInterface`](src/main/java/org/example/s07_datastructures/t11_map/MapInterface.java) | ⬜ |
| 12 | [HashMap](https://www.w3schools.com/java/java_hashmap.asp) | [`HashMapDemo`](src/main/java/org/example/s07_datastructures/t12_hashmap/HashMapDemo.java) | ⬜ |
| 13 | [TreeMap](https://www.w3schools.com/java/java_treemap.asp) | [`TreeMapDemo`](src/main/java/org/example/s07_datastructures/t13_treemap/TreeMapDemo.java) | ⬜ |
| 14 | [LinkedHashMap](https://www.w3schools.com/java/java_linkedhashmap.asp) | [`LinkedHashMapDemo`](src/main/java/org/example/s07_datastructures/t14_linkedhashmap/LinkedHashMapDemo.java) | ⬜ |
| 15 | [Iterator](https://www.w3schools.com/java/java_iterator.asp) | [`IteratorDemo`](src/main/java/org/example/s07_datastructures/t15_iterator/IteratorDemo.java) | ⬜ |
| 16 | [Algorithms](https://www.w3schools.com/java/java_algorithms.asp) | [`Algorithms`](src/main/java/org/example/s07_datastructures/t16_algorithms/Algorithms.java) | ⬜ |

### 8. Java Advanced

| # | Topic | Lessons | Status |
|---|-------|---------|--------|
| 01 | [Wrapper Classes](https://www.w3schools.com/java/java_wrapper_classes.asp) | [`WrapperClasses`](src/main/java/org/example/s08_advanced/t01_wrapperclasses/WrapperClasses.java) | ⬜ |
| 02 | [Generics](https://www.w3schools.com/java/java_generics.asp) | [`Generics`](src/main/java/org/example/s08_advanced/t02_generics/Generics.java) | ⬜ |
| 03 | [Annotations](https://www.w3schools.com/java/java_annotations.asp) | [`Annotations`](src/main/java/org/example/s08_advanced/t03_annotations/Annotations.java) | ⬜ |
| 04 | [RegEx](https://www.w3schools.com/java/java_regex.asp) | [`RegEx`](src/main/java/org/example/s08_advanced/t04_regex/RegEx.java) | ⬜ |
| 05 | [Threads](https://www.w3schools.com/java/java_threads.asp) | [`Threads`](src/main/java/org/example/s08_advanced/t05_threads/Threads.java) | ⬜ |
| 06 | [Lambda](https://www.w3schools.com/java/java_lambda.asp) | [`Lambda`](src/main/java/org/example/s08_advanced/t06_lambda/Lambda.java) | ⬜ |
| 07 | [Advanced Sorting](https://www.w3schools.com/java/java_advanced_sorting.asp) | [`AdvancedSorting`](src/main/java/org/example/s08_advanced/t07_advancedsorting/AdvancedSorting.java) | ⬜ |

### 9. Java Reference

| # | Topic | Lessons | Status |
|---|-------|---------|--------|
| 01 | [Keywords](https://www.w3schools.com/java/java_ref_keywords.asp) | [`Keywords`](src/main/java/org/example/s09_reference/t01_keywords/Keywords.java) | ⬜ |
| 02 | [String Methods](https://www.w3schools.com/java/java_ref_string.asp) | [`StringMethods`](src/main/java/org/example/s09_reference/t02_stringmethods/StringMethods.java) | ⬜ |
| 03 | [Math Methods](https://www.w3schools.com/java/java_ref_math.asp) | [`MathMethods`](src/main/java/org/example/s09_reference/t03_mathmethods/MathMethods.java) | ⬜ |
| 04 | [Output Methods](https://www.w3schools.com/java/java_ref_output.asp) | [`OutputMethods`](src/main/java/org/example/s09_reference/t04_outputmethods/OutputMethods.java) | ⬜ |
| 05 | [Arrays Methods](https://www.w3schools.com/java/java_ref_arrays.asp) | [`ArraysMethods`](src/main/java/org/example/s09_reference/t05_arraysmethods/ArraysMethods.java) | ⬜ |
| 06 | [ArrayList Methods](https://www.w3schools.com/java/java_ref_arraylist.asp) | [`ArrayListMethods`](src/main/java/org/example/s09_reference/t06_arraylistmethods/ArrayListMethods.java) | ⬜ |
| 07 | [LinkedList Methods](https://www.w3schools.com/java/java_ref_linkedlist.asp) | [`LinkedListMethods`](src/main/java/org/example/s09_reference/t07_linkedlistmethods/LinkedListMethods.java) | ⬜ |
| 08 | [HashMap Methods](https://www.w3schools.com/java/java_ref_hashmap.asp) | [`HashMapMethods`](src/main/java/org/example/s09_reference/t08_hashmapmethods/HashMapMethods.java) | ⬜ |
| 09 | [Scanner Methods](https://www.w3schools.com/java/java_ref_scanner.asp) | [`ScannerMethods`](src/main/java/org/example/s09_reference/t09_scannermethods/ScannerMethods.java) | ⬜ |
| 10 | [File Methods](https://www.w3schools.com/java/java_ref_file.asp) | [`FileMethods`](src/main/java/org/example/s09_reference/t10_filemethods/FileMethods.java) | ⬜ |
| 11 | [FileInputStream](https://www.w3schools.com/java/java_ref_fileinputstream.asp) | [`FileInputStreamMethods`](src/main/java/org/example/s09_reference/t11_fileinputstream/FileInputStreamMethods.java) | ⬜ |
| 12 | [FileOutputStream](https://www.w3schools.com/java/java_ref_fileoutputstream.asp) | [`FileOutputStreamMethods`](src/main/java/org/example/s09_reference/t12_fileoutputstream/FileOutputStreamMethods.java) | ⬜ |
| 13 | [BufferedReader](https://www.w3schools.com/java/java_ref_bufferedreader.asp) | [`BufferedReaderMethods`](src/main/java/org/example/s09_reference/t13_bufferedreader/BufferedReaderMethods.java) | ⬜ |
| 14 | [BufferedWriter](https://www.w3schools.com/java/java_ref_bufferedwriter.asp) | [`BufferedWriterMethods`](src/main/java/org/example/s09_reference/t14_bufferedwriter/BufferedWriterMethods.java) | ⬜ |
| 15 | [Iterator Methods](https://www.w3schools.com/java/java_ref_iterators.asp) | [`IteratorMethods`](src/main/java/org/example/s09_reference/t15_iteratormethods/IteratorMethods.java) | ⬜ |
| 16 | [Collections Methods](https://www.w3schools.com/java/java_ref_collections.asp) | [`CollectionsMethods`](src/main/java/org/example/s09_reference/t16_collectionsmethods/CollectionsMethods.java) | ⬜ |
| 17 | [System Methods](https://www.w3schools.com/java/java_ref_system.asp) | [`SystemMethods`](src/main/java/org/example/s09_reference/t17_systemmethods/SystemMethods.java) | ⬜ |
| 18 | [Errors & Exceptions](https://www.w3schools.com/java/java_ref_errors.asp) | [`ErrorsAndExceptions`](src/main/java/org/example/s09_reference/t18_errorsexceptions/ErrorsAndExceptions.java) | ⬜ |


### 10. Java How To's

| # | Topic | Lessons | Status |
|---|-------|---------|--------|
| 01 | [Numbers](https://www.w3schools.com/java/java_howto_add_two_numbers.asp) | [`AddTwoNumbers`](src/main/java/org/example/s10_howtos/t01_numbers/AddTwoNumbers.java), [`SwapTwoVariables`](src/main/java/org/example/s10_howtos/t01_numbers/SwapTwoVariables.java), [`EvenOrOdd`](src/main/java/org/example/s10_howtos/t01_numbers/EvenOrOdd.java), [`ReverseNumber`](src/main/java/org/example/s10_howtos/t01_numbers/ReverseNumber.java), [`PositiveOrNegative`](src/main/java/org/example/s10_howtos/t01_numbers/PositiveOrNegative.java), [`SquareRoot`](src/main/java/org/example/s10_howtos/t01_numbers/SquareRoot.java), [`AreaOfRectangle`](src/main/java/org/example/s10_howtos/t01_numbers/AreaOfRectangle.java), [`CelsiusToFahrenheit`](src/main/java/org/example/s10_howtos/t01_numbers/CelsiusToFahrenheit.java), [`SumOfDigits`](src/main/java/org/example/s10_howtos/t01_numbers/SumOfDigits.java), [`ArmstrongNumber`](src/main/java/org/example/s10_howtos/t01_numbers/ArmstrongNumber.java), [`RandomNumber`](src/main/java/org/example/s10_howtos/t01_numbers/RandomNumber.java) | ⬜ |
| 02 | [Strings](https://www.w3schools.com/java/java_howto_count_words.asp) | [`CountWords`](src/main/java/org/example/s10_howtos/t02_strings/CountWords.java), [`CountVowels`](src/main/java/org/example/s10_howtos/t02_strings/CountVowels.java), [`RemoveVowels`](src/main/java/org/example/s10_howtos/t02_strings/RemoveVowels.java), [`CountDigits`](src/main/java/org/example/s10_howtos/t02_strings/CountDigits.java), [`ReverseString`](src/main/java/org/example/s10_howtos/t02_strings/ReverseString.java), [`PalindromeCheck`](src/main/java/org/example/s10_howtos/t02_strings/PalindromeCheck.java), [`AnagramCheck`](src/main/java/org/example/s10_howtos/t02_strings/AnagramCheck.java), [`StringToArray`](src/main/java/org/example/s10_howtos/t02_strings/StringToArray.java), [`RemoveWhitespace`](src/main/java/org/example/s10_howtos/t02_strings/RemoveWhitespace.java), [`CharacterFrequency`](src/main/java/org/example/s10_howtos/t02_strings/CharacterFrequency.java) | ⬜ |
| 03 | [Arrays](https://www.w3schools.com/java/java_howto_sum_of_array_elements.asp) | [`SumOfArray`](src/main/java/org/example/s10_howtos/t03_arrays/SumOfArray.java), [`ArrayAverage`](src/main/java/org/example/s10_howtos/t03_arrays/ArrayAverage.java), [`SortArray`](src/main/java/org/example/s10_howtos/t03_arrays/SortArray.java), [`SmallestElement`](src/main/java/org/example/s10_howtos/t03_arrays/SmallestElement.java), [`LargestElement`](src/main/java/org/example/s10_howtos/t03_arrays/LargestElement.java), [`SecondLargest`](src/main/java/org/example/s10_howtos/t03_arrays/SecondLargest.java), [`MinAndMax`](src/main/java/org/example/s10_howtos/t03_arrays/MinAndMax.java), [`MergeArrays`](src/main/java/org/example/s10_howtos/t03_arrays/MergeArrays.java), [`RemoveDuplicates`](src/main/java/org/example/s10_howtos/t03_arrays/RemoveDuplicates.java), [`FindDuplicates`](src/main/java/org/example/s10_howtos/t03_arrays/FindDuplicates.java), [`ShuffleArray`](src/main/java/org/example/s10_howtos/t03_arrays/ShuffleArray.java) | ⬜ |
| 04 | [Math](https://www.w3schools.com/java/java_howto_factorial.asp) | [`Factorial`](src/main/java/org/example/s10_howtos/t04_math/Factorial.java), [`Fibonacci`](src/main/java/org/example/s10_howtos/t04_math/Fibonacci.java), [`FindGcd`](src/main/java/org/example/s10_howtos/t04_math/FindGcd.java), [`PrimeCheck`](src/main/java/org/example/s10_howtos/t04_math/PrimeCheck.java) | ⬜ |
| 05 | [Loops](https://www.w3schools.com/java/java_howto_loop_through_arraylist.asp) | [`LoopArrayList`](src/main/java/org/example/s10_howtos/t05_loops/LoopArrayList.java), [`LoopHashMap`](src/main/java/org/example/s10_howtos/t05_loops/LoopHashMap.java), [`LoopEnum`](src/main/java/org/example/s10_howtos/t05_loops/LoopEnum.java) | ⬜ |

## Key Takeaways

<!-- Add a short note per topic as you finish it, e.g. a gotcha you hit or a concept that clicked. -->
