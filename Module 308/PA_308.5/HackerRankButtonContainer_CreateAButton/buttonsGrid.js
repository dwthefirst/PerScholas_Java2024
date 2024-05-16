let button5 = document.getElementById('btn5');
let order = [1, 2, 3, 6, 9, 8, 7, 4];

button5.onclick = function() {
    order.unshift(order.pop()); //add to the beginning the last element (this essentially shifts the entire order down 1 with the last element now at the front.)
    /*
      so the buttons themselves stay the SAME!
      what is changing is the actual text value inside the button tag which is being displayed!
      that's what the order array of numbers is for.
    */
    //replaces the actual TEXT NUMBER with the value of the order index (in this case is the FIRST number in the order array) - (Which just got shifted down because the last element got moved to the beginning and everything else moved down (the order of the numbers shifting clockwise) 
    document.getElementById('btn1').innerHTML = order[0]; 
    document.getElementById('btn2').innerHTML = order[1]; //second element in the order array
    document.getElementById('btn3').innerHTML = order[2]; //third element
    document.getElementById('btn6').innerHTML = order[3]; //fourth element (juming to button 6 because that's the next button in the actual order of CLOCKWISE)
    document.getElementById('btn9').innerHTML = order[4];
    document.getElementById('btn8').innerHTML = order[5];
    document.getElementById('btn7').innerHTML = order[6];
    document.getElementById('btn4').innerHTML = order[7];
    
}

