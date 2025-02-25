class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

# Insertion

def insertNode(head, newNode, position):
    if position == 1:
        newNode.next = head
        return newNode
    
    currentNode = head
    for _ in range(position - 2):
        if currentNode is None:
            break
        currentNode = currentNode.next
        
    newNode.next = currentNode.next
    currentNode.next = newNode
    return head

def traverseList(head):
    currentNode = head
    while currentNode:
        print(currentNode.data, end=" -> ")
        currentNode = currentNode.next
    print("end")
    
node1 = Node(1)
node2 = Node(2)
node3 = Node(3)
node4 = Node(4)
node5 = Node(5)

newNode = Node(10)

node1.next = node2
node2.next = node3
node3.next = node4
node4.next = node5

traverseList(node1)

insertNode(node1, newNode, 3)

traverseList(node1)

print("\n\nEnd Of Insertion.")