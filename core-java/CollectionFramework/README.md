# Collection Framework In Java

The Collection in Java is a framework that provides an architecture to store and manipulate the group of objects.

**Note: This doc only provides brief descriptions for quick reference**
![Collection Framework UML](../CollectionFramework/files/CollectionFramework.png "UML")

## Quick Review
All the collections are of type **Collection** and this has some generic methods such as
**add, addAll, clear, contains, containsAll, remove, removeAll, size, toArray, isEmpty**

Interfaces which directly extends the Collection interface or provides the base of different type of Collections are
*Queue*, *List* and *Set*.

### List vs Set vs Queue

**List** is an ordered collection (like a sequence). User can precise control over where to add/remove  the element
in the list. It allows duplicates. So support this index based **add, remove** methods are available.
You can also find the index/position of an element using **indexOf, lastIndexOf** methods.

**Queue** is also an ordered collection. But you can add the elements at the end and remove/view the beginning of the 
queue. It allows duplicates. Additional methods supporting the same are **offer, peek, poll**.

A **Set** is not ordered and cannot contain duplicates. You can add, remove and check if the element exists in the Set 
or not. This does not provide any additional methods.

### List Implementations (Go through example codes for better understanding)

#### 1. ArrayList
Resizable-array implementation of the List interface. Implements all optional list operations, and permits all elements,
including null. In addition to implementing the List interface, this class provides methods to manipulate the size of 
the array that is used internally to store the list. (This class is roughly equivalent to Vector, except that it is not synchronized.)

#### 2. Vector
Vector is similar to ArrayList except methods are synchronized.

#### 3. Stack
The Stack class represents a last-in-first-out (LIFO) stack of objects. It extends class Vector with five operations 
that allow a vector to be treated as a stack. The usual **push** and **pop** operations are provided, as well as a method 
to **peek** at the top item on the stack, a method to test for whether the stack is **empty**, and a method to **search** 
the stack for an item and discover how far it is from the top.

A more complete and consistent set of LIFO stack operations is provided by the Deque interface and its implementations, 
which should be used in preference to this class. For example:

Deque<Integer> stack = new ArrayDeque<Integer>();

#### 4. LinkedList (also implements **Deque**)
Doubly-linked list implementation of the List and Deque interfaces. Implements all optional list operations, and permits 
all elements (including null).
All the operations perform as could be expected for a doubly-linked list. Operations that index into the list will 
traverse the list from the beginning or the end, whichever is closer to the specified index.

### PriorityQueue (Queue Implementation)

An unbounded priority queue based on a priority heap. The elements of the priority queue are ordered according to their 
natural ordering, or by a Comparator provided at queue construction time, depending on which constructor is used. A 
priority queue does not permit null elements. A priority queue relying on natural ordering also does not permit insertion 
of non-comparable objects (doing so may result in ClassCastException).

### Deque (Extends Queue)
A linear collection that supports element insertion and removal at both ends. The name deque is short for "double ended 
queue" and is usually pronounced "deck". Most Deque implementations place no fixed limits on the number of elements they 
may contain, but this interface supports capacity-restricted deques as well as those with no fixed size limit.

### ArrayDeque (Implements Deque)
Resizable-array implementation of the Deque interface. Array deques have no capacity restrictions; they grow as necessary to support usage. They are not thread-safe; in the absence of external synchronization, they do not support concurrent access by multiple threads. Null elements are prohibited. This class is likely to be faster than Stack when used as a stack, and faster than LinkedList when used as a queue.


### LinkedList (Implements Both Deque and List)
A linear collection that supports element insertion and removal at both ends. The name deque is short for "double ended 
queue" and is usually pronounced "deck". Most Deque implementations place no fixed limits on the number of elements they 
may contain, but this interface supports capacity-restricted deques as well as those with no fixed size limit.

### Set implementations (HashSet, LinkedHashSet, TreeSet)

#### 1. HashSet
It can contain only unique elements. Nulls are allowed. Insertion order is not preserved. Uses **Hashing** mechanism to
store objects.

#### 2. LinkedHashSet
Similar to HashSet but insertion order is preserved.

#### 3. TreeSet ( Implements SortedSet and NavigableSet as-well)

##### SortedSet (Interface)
The elements are ordered using their natural ordering, or by a Comparator typically provided at sorted set creation time.
The set's iterator will traverse the set in ascending element order.
Methods: **first, last, headSet, tailSet, subSet**

##### NavigableSet (Interface)

A SortedSet extended with navigation methods reporting the closest matches for given search targets. Methods **lower, floor, ceiling, and higher**
return elements respectively less than, less than or equal, greater than or equal, and greater than a given element, returning null if there is no such element. 
A NavigableSet may be accessed and traversed in either ascending or descending order. The **descendingSet** method returns 
a view of the set with the senses of all relational and directional methods inverted. The performance of ascending operations 
and views is likely to be faster than that of descending ones. This interface additionally defines methods **pollFirst** 
and **pollLast** that return and remove the lowest and highest element, if one exists, else returning null. 
Methods **subSet, headSet, and tailSet** differ from the like-named SortedSet methods in accepting additional arguments describing whether lower and upper bounds are inclusive versus exclusive.

#### Special Mention EnumSet
A specialized Set implementation for use with enum types. All of the elements in an enum set must come from a single enum 
type that is specified, explicitly or implicitly, when the set is created. Enum sets are represented internally as bit 
vectors. This representation is extremely compact and efficient. The space and time performance of this class should be 
good enough to allow its use as a high-quality, typesafe alternative to traditional int-based "bit flags." Even bulk 
operations (such as containsAll and retainAll) should run very quickly if their argument is also an enum set.