

class Node {
  constructor(val) {
      this.val = val
      this.next = null
  }
}

var a = new Node(1)
var b = new Node(2)
var c = new Node(3)
a.next = b;
b.next = c; 

class SLL {
  constructor() {
          this.head = null;
      }

  // ------------------------------------- Week 1 Day 3 algo -------------------------------------------
  
  insertAtFront(val){
      // construct a node with the val
      var newNode = new Node(val);
      // make the new node as the front (HINT: What is the front of a Singly Linked List)
      if (!this.head){
        this.head = newNode;
      } else {
          newNode.next = this.head;
          // var temp = this.head;
          this.head = newNode;
          // this.head.next = temp; 
          // console.log(newNode)
      }
  }


  removeHead(){
      // Remove the head (HINT: What will be the new head?)
    if (!this.head) {
      return "no head";
    } 
    this.head = this.head.next;
  }

  //*** bonus question ***
  average(){
    if(!this.head){
      console.log("Empty list");
      return
  }
  var sum = 0;
  var counter = 0;
  var runner = this.head;
  while(runner){ // while(runner != null)
      // console.log(runner.val);
      sum += runner.val;
      runner = runner.next;
      counter ++;            
  }
  var result = sum/counter;
  return result;
  }
  // ------------------------------------- END OF Week 1 Day 3 algo -------------------------------------------



  // If you want to use the following methods, please fill in the logic on your own. (You can copy from Discord if you want to)
  // ------------------------------------- Week 1 Day 2 algo -------------------------------------------
  isEmpty(){
    if (!this.head){
      console.log("Empty List");
      return true;
    }
    return false;
  }

  insertAtBack(val){
    // instantiate the node with the val
    var d = new Node(val);
    // put the new val into the list       
    var runner = this.head;
    // Loop until runner.next = null
    while (runner.next) {      
      runner = runner.next
    }
    runner.next = d;
  }

  arrToList(arr){
    // loop through the array
    for (var i=0; i<arr.length; i++) {
      // add each value in array to back of SLL
      this.insertAtBack(arr[i]);
    }

  }

  printList(){
      if(!this.head){
          console.log("Empty list");
          return
      }
      var runner = this.head;
      while(runner){ // while(runner != null)
          console.log(runner.val);
          runner = runner.next;            
      }
  }

  // ------------------------------------- END OF Week 1 Day 2 algo -------------------------------------------


}

var list1 = new SLL();

console.log("\n**** Insert at front ****\n")
list1.insertAtFront(4);

list1.printList();
// list1: (1) --> (2) --> (3) --> null
