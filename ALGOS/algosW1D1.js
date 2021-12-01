//construct Node class
class Node{
    constructor(val){
        this.val = val
        this.next = null;
    }
}

//construct SLL class
class SLL{

}

//create a list of nodes following (1) -> (2) -> (3) -> null
// you can use the helper function printNode(node)
// you can create a new class by 
//let a = new ClassName(val)

var a = new Node(1)
var b = new Node(2)
a.next = b
var c = new Node(3)
b.next = c

console.log(a)
console.log(a.next)
console.log(a.next.next)

//create a SingleLinkedList with the above nodes. (1) is the head
// you can use the helper function printList(list) 



// ---------------HELPER FUNCTION --------------------
//Print the nodes
function printNode(node){
    var str="";
    var curr = node
    while(curr){
        str+=curr.val+" -> ";
        curr=curr.next;

    }
    str+="null";
    console.log(str)

}



//Print the SLL 
function printList(list){
    if(!list.head){
        return "Empty list"
    }
    var str="";
    console.log("List head: "+list.head.val)
    var curr = list.head;
    while(curr){
        str+=curr.val+" -> ";
        curr=curr.next;

    }
    str+="null";
    console.log(str)
}