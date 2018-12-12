# _Scala, a modern Functional and OOP language_

- Andrew Dale
- andrew.dale@uoit.net

## _Brief synopsis of the language_

> _Scala Basics_
>
> Scala is a general-purpose programming language which also supports functional programming --> The language is multi-paradigm. The language was designed to address criticisms of Java -- the language on which it is built. 
> The language first appeared in January of 2004, almost 15 years ago. 
> Developed at the Programming Methods Laboratory of École Polytechnique Fédérale de Lausanne
> The language's typing discipline is static, strong, inferred and structual. 
> Utilizes .scala and .sc filetypes
> Lexical Scoping
## About the syntax

> _code snippet_

Specifically, Scala does not have a "let" form


> A simple 'foreach' loop:

```scala
for(i <- List.range(0, 10, 1)){
	if(i % 2 == 0){
		println("Even")
}	else{
		println("Odd")
}
}
```
## About the tools

> Scala can be developed in a multitude of ways, most commonly in IntelliJ IDEA
> Or similarly can be developed on the command line via text-editors such as VIM> 
> Either way, the project manager SBT is used to manage larger scala projects
> Unfortunately however, it would seem that SBT (at least in my personal experience) is oft convoluted and doesn't feel great to use

## About the standard library

> _Give some examples of the functions and data structures
> offered by the standard library_.


> Given that Scala is built upon the JVM, almost all functionality is cross-compatible with Scala (as in Java -> Scala)
> This includes standard .Math etc etc. 

## About open source library

> Scala has a multitude of open-source libraries available, the two in particular that I found interesting were Breeze and Vegas (two data visualization libraries) to help bridge the gap for burgeoning data scientists with an interest in Scala. 
> Vegas is touted as the Matplotlib for Scala and whilst this may have been true, a lack of updates and contributions have let the project fall to the way-side lacking support for the newest updates of Scala itself. 
# Analysis of the language

> _I'll be honest, I'm not particularly a fan of the language after a brief period of use, albeit that could certainly change over time_

