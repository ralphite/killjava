
Marin Prep Java
==============

##Head quarter based in Mission Street which I visited many times and liked very much.
##Coderpad.io有时抽风，如果花时间太长然后失败可以重试
> There was a problem executing the code. Please try again.

- abstract class vs interface
  - abstract class can have concrete methods while interface cannot
  - interface's fields have to be `public static final` while abstract class's fields dont have to
  - interface's methods have to be public while abstract class's methods can be private, protected and public
  - you can extend only one anstract class while you can implement multiple interfaces

- TreeMap
  - a red-black tree based NavigatableMap implementation

- int vs Integer or else
  - int is fast and mutable, Integer is much more bulkier and immutable
  - int is a primitive type while Integer is an object type
  - int can use operators while Integer cannot
  - Integer can be used in collections such as HashMap, is serializable, etc.

- **understand trees, heaps and PriorityQueues**


- questions
  - `DONE` find common chars in two strings
  - `DONE` find anagrams in a list of strings
  - `DONE` find the nth biggest number from a long list of numbers (O(n) quickselect)
  - `DONE` find the 10 biggest numbers in from a long list of numbers
  - `DONE` worst case node addition time in BST
  - how is a HashSet implemented
  - `DONE` explain a TreeMap
  - standard tree questions whiteboard coding
  - what methods do you have to implement to make the object properly comparable
  - java concepts and bst questions
  - hashmap node addition time
  - `DONE` hashmap methods - name any 7 of them
  - `DONE` find the most frequently used word in a string
  - `DONE` print the correct sentense in the correct order
  - `DONE` Check whether two strings are anagram of each other
  - `DONE` compare abstract class and interface
  - `DONE` what is 4 left shift 2 XOR 2
  - `DONE` what is the value of a number with all bits as 0 except the leftmost one - **MINIMUM_VALUE**
  - `DONE` given 2 sets, determine if the second set is a subset of the first
  - Date vs calendar
  - `DONE` long vs object long
  - `DONE` what is abstract class, how do you instantiate it ?
  - `DONE` int vs integer for counting number of times for loop runs - sure you want to use int
  - `DONE` what is a final class
  - `DONE` difference between private vs protected keywords
  - `DONE` difference between list and set
  - `DONE` Each interviewer had a java programing question in mind and asked to code it on the white board. Some were tough ones and some were easy. eq, Str rev, Factorial, Fibonacci series. etc
  - `DONE` There was one product manager who actually gave me their web tool and asked me to find bugs on it and actually asked me to file the bug in bugzilla, this was kind of cool.
  - `DONE` Write a program to find factorial of a number - can use `java.math.BigInteger` which is not well designed
  - `DONE` Write a program to find the magic triangle or summation n
  - `DONE` [Quality Assurance Engineer Interview](http://www.glassdoor.com/Interview/Marin-Software-Quality-Assurance-Engineer-Interview-Questions-EI_IE113537.0,14_KO15,41.htm#RVW1206833)
  - How would you design a web application that handles text lists as well as lists of lists?

- questions asked
    - phone 1 round by hr
    - linux cmds - top, ps, crontab -l, etc
    - how to see tables in mysql
    - compare override and overload
- phone 2 round by tech lead
    - explain experiences in test automation
    - implement function to reverse and string and remove consecutive duplicate chars, eg "aabbbcbbddd" => "dbcba"
    - implement a method to swap two elements in an array, make it generic
    - explain singleton and implement it. how to make it not cloneable?
    - what questions do you have?
- onsite 1 with dev lead
    - find 2nd biggest int
    - find kth biggest int
    - test this method
    - name the interfaces/classes in the collections framework
    - which classes are thread safe?
- onsite 2 with test lead
    - explain past testing work experience
    - how was the ** framework implemented?
    - specific questions about selenium
    - swap 2 elements in an array how to support primitive types and object types?
- onsite 3 with pm
    - code review
    - equals and hashCode
    - overload vs override
    - explain Singleton and it's applications
- onsite 4 with hr
    - how do you feel?
    - money
    - time onboard
