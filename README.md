# BasicQueueOperations

You will be given an integer N representing the number of elements to enqueue (add), an integer S representing the number of elements to dequeue (remove/poll) from the queue, and finally an integer X, an element that you should check whether is present in the queue. If it is - prints true on the console, if it is not - print the smallest element currently present in the queue.

Examples :
----------

Input |	Output |	Comments
------|--------|-----------
5 2 32 | true |We have to push 5 elements. Then we pop 2 of them. Finally, we have to check whether 13 is present in the stack. Since it is, we print true
1 13 45 32 4 | |
4 1 666 | 13 |
666 69 13 420 | |
3 3 90 | 0 |
90 90 90 | |


