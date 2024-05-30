# Beetroot

## Introduction

`Beetroot` is small **statically** typed **DSL** (domain specific language) written in **Java** which has a similar syntax to **Python**. Currently it can be transpiled to **Python**.

## Usage

Compile `.bs` files with the [beetroot.jar](https://github.com/krisztianszenasi/beetroot/releases/download/v0.0.1/beetroot.jar).

```
java -jar beetroot.jar example.bs
```

If the source code is correct then a `example.bs.py` file will be created
otherwise the error messages will be printed to the standard output.

## Language features

### Variable declarations

Variables can be declared by either `var` or `val` keywords. They stand for
`mutable` and `immutable` variables respectively.

```
var mutableVariable = 1
val variableImmutable = "hello"
```

### Primitive types

**`Beetroot` currently supports the following primitive types:**

* `any`: Super type for all the types below
* `int`: Integer numbers
* `dec`: Floating point numbers
* `bool`: True and False values
* `str`: String values

```
var myAny: any = 1
var myInt: int = 1
var myDec: dec = 1.0
var myBool: bool = true
var myStr: str = "hello"
```


### Compound types

**`Beetroot` currently supports the following compound types:**

* `list`: Lists
* `dict`: Dictionaries / Hashmaps



```
# list with `int` elements
var myList: list[int] = [1,2,3]

# 2d list
var my2DList: list[list[int]] = [[1,2,3], [4,5,6]]

# dict with `str` keys and `int` values
var myDict: dict[str, int] = {"a": 1, "b": 2}

# dict with list values
var myDictOfLists: dict[str, list[int]] = {"even": [1,2,3], "odd": [4,5,6]}
```

### Binary operators

`Beetroot` supports a given set of **binary operators**. During the `semantic
analysis` the compiler searches between these operators. They determine the
`type` of the resulting value. If a compatible operator cannot be find for an
expression a `TypeError` is raised.

> **Format**: `<operator kind>`(`<operand1 type>`, `<operand1 type>`) -> `result type`

## `int`:
    
* `+`(`int`, `int`) -> `int`
* `-`(`int`, `int`) -> `int`
* `*`(`int`, `int`) -> `int`
* `/`(`int`, `int`) -> `int`
* `%`(`int`, `int`) -> `int`
  
## `dec`:
    
* `+`(`dec`, `dec`) -> `dec`
* `-`(`dec`, `dec`) -> `dec`
* `*`(`dec`, `dec`) -> `dec`
* `/`(`dec`, `dec`) -> `dec`
* `%`(`dec`, `dec`) -> `dec`
  

## `num`:

>  Type `num` is the **super type** of `int` and `dec`.

* `<`(`num`, `num`) -> `bool`
* `>`(`num`, `num`) -> `bool`
* `<=`(`num`, `num`) -> `bool`
* `>=`(`num`, `num`) -> `bool`

## `str`:

* `+`(`str`, `str`) -> `str`: (eg. `"hello" + "world" = "helloworld`)
* `*`(`str`, `int`) -> `str`  (eg. `"hello" * 2 = "hellohello"`)
* `*`(`int`, `str`) -> `str`

## `any` (logical operators)

* `==`(`any`, `any`) -> `bool`
* `!=`(`any`, `any`) -> `bool`
* `and`(`any`, `any`) -> `bool`
* `or`(`any`, `any`) -> `bool`
* `in`(`any`, `any`) -> `bool`

### Unary operators

> **Format**: `<operator kind>`(`<operand type>`) -> `result type`

* `not`(`any`) -> `bool`
* `+`(`num`) -> `num`
* `-`(`num`) -> `num`

### Function definitions

Functions can be defined via the `fun` keyword followed by the name of the
function. Arguments must have type declarations. The return value is optional,
the return statement will be checked accordingly. The declaration has to be
closed with the `end` keyword.

```
fun foo(bar: int, baz: dec) -> int:
    return 3 * bar
end
```

### For statements

For statements can be created with the `for` keyword. The iterating variable
can have explicit type declaration however this is only optional. Also the
block itself can have an optional `else` block which will be run right after
the last iteration.

```
for x: int in 1..2:
    print(x)
else:
    print("finished")
end
```

### While statements

While statements can be created with `while` keyword. They can have optional
`else` blocks as well.

```
var x = 10
while x > 0:
    print("still running")
    x -= 1
else:
    print("finished")
end
```

### If/ElIf statements

If and ElIf statements can be created with the `if` and `elif` keywords.

```
if true:
    print("true block")
elif false:
    print("elif block")
else:
    print("wasn't true")
end
```
