- o of 1 which is constant and best --> O(1) e.g: given index of an arry, get its value
- O of logn which logarithmic which is 2nd best after O(1) --> O(log2n)
- O of n  which is 3rd best which is linear --> O(n) e.g: find the value from an array and not given the index, so have to possibly loop through all indexes of that array
- O of nlogn which is 4th best --> O(nlogn)
- O of n square which is 5thd best --> O(n2)


- ArrayList is backed by an array, so removing and adding will be bad due to O(n) because you have to loop
- Vector is backed by an array. Similar to ArrayList but Vector is thread safe
- LinkedList (singly or doubly) is not backed by an array but rather nothing since it grows as you add item to the head or tail. This give you O(1)
- stack is LIFO and it is not back by anything but it is idealy backed by a linked list since it is only working with push/pop/peek on the last item that is on top of the stack. This gives you O(1)
- queue is FIFO
