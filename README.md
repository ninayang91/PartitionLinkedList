# PartitionLinkedList
Partition Linked List by a value, 

//partition a linked list around a value x

//all nodes less than x come before all nodes greater than or equal to x

//create a list, higher value add after the head, smaller value add before the head

we create two pointers, before and after,they are equal to null, 

add nodes to before and after list, move backforwards, so we need to mark n.next

merge two lists, if there is no data smaller than x, before is null, return after

