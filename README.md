# 6516 Object Oriented Programming and Software Design

---

# Part1 - Introduction of Java

- Primitive data types: `boolean < byte < short < char = int = float < long = double`
- Enumerated types: `enum Object {object1, object2}`,  for use → `Object.object1`
- Precedence: `++a ≥ 3` add firstly but  `a++≥3` judge firstly
- Repetition: `for(code1, code2 ,code2){ }` or `while(code){ }` or `do { } while(code)`
- Nesting loops: 嵌套循环
- Arrays: `int[] a = new int[100]` or `int[][] a = new int[3][3]`→ create an memory area
    - `int[] b = {1,2,3}`
    - or anonymously assign `int[] b; b = new int {1,2,3};`
    - Copying: `a = b` same variables point, use `System.arraycopy` to copy value by value
- Characters: char → a single Unicode character, an extension of ASCII, with 65536(FFFF) characters
- Sting: a class not primitive type, `+` to add strings and cast type directly

---

# Part2 - Classes and inheritance

## Class

- Objects ← certain properties (**fields**) + certain operations (**methods**)
- Procedural programming **vs** OOP
    - Top down design ↔  object focused design
    - hard to reuse ↔  code resue
    - complex code ↔  complex design → object's interface
    - global data focused ↔  protected data
- **Class, Object, Encapsulation, Overloading** :
    - Class → the blueprint for an object
    - Object → an instance of a class (calling class constructor)
    - Encapsulation → combining data and behavior in an object, hide private data and methods from outside
    - Overloading → methods (including constructor) with the same but different argument list, ≠ override
- Class constructor: `public class Name{ public Name(Parameters){ } }`

## Inheritance - Don’t use inheritance unless the inherited methods make sense conceptually

- Basic idea → create new classes extending existing classes (reuse methods and fields)
- keyword: **extend** → `public class NewClass extends OldClass {}`
- Access modifiers → Use private unless you have a good reason not to
    - Default → within the package
    - Public → to the world
    - Private → within the Publication class only
    - Protected → within the package where it is declared, and subclasses of the declared class
- Constructing extended classes
    - mutator fields `setValue()` in the super class → `this.setValue(value)`
    - **chaining constructors** → invoke the super class constructor `super(parameters)` → must be the first statement
- Override → `public` or `protected`
    - use `final` to prevent overriding → `public final class Name{}`  → can not extend
    - or `public final String MethodName(){}`

## Methods

- Definition → `modifiers type name (parameters) [exception handling] { body }`
- instance fields → `private Sting name` → encapsulation using **Mutator methods**
- `static` → class fields and class methods → do not need to create an instance
    - use when you can supply all parameters explicitly
    - and/or the method only accesses class (static) fields
- Compiler: Method candidates → Overload resolution → Static binding → Dynamic binding → Method table

---