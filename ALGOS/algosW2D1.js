class Stack{
    constructor(){
        this.items=[]
        this.capacity= 10
    }

    push(item){
        this.items.push(item);
        //add an item at the top
    }

    pop(){
      
      var poppeditem = this.items.pop(); 
      return poppeditem;
        //remove the top/last item from the stack 
        //return the removed item
    }

    peek(){
      // var poppeditem = this.items.pop(); 
      // this.items.push(poppeditem);
      // return poppeditem;

    return this.items[this.items.length-1];
        // return the top item without removing it
    }

    size(){
      return this.items.length;
        //return the size of the stack
    }

    isEmpty(){
      if(this.items.length == 0){
      return "this is empty"; 
      }        // check if the stack is empty
    }

    isFull(){
       if(this.items.length == 0){
      return "this is empty"; 
      }else if(this.items.length == this.capacity){
        return "this is full, bro"
        
      }  
        else{
          return "its not full, it has" + this.capity + "items";
        }
      

        

        // check if the stack is full based on the capacity
    }
    
    printStack(){
        console.log("TOP");                                      
        for(var i=this.items.length-1; i >= 0; i--){
            console.log(this.items[i])
        }
    }
}

var stack1 = new Stack()
//TESTING PUSH
stack1.push(1);
stack1.push(2);
stack1.push(3);
stack1.push(4);
stack1.push(5);
stack1.push(5);
stack1.push(5);
stack1.push(5);
stack1.push(5);
stack1.push(5);
stack1.printStack() //expected: top 5,4,3,2,1
// stack1.pop();
// stack1.peek();
// stack1.size();
stack1.isFull();
// TESTING POP()
// console.log(stack1.pop());  //expected: 5
// stack1.printStack() // expected: top 4,3,2,1