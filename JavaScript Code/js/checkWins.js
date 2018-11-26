var topLeft = [ "btn1", "btn2", "btn3", "btn10", "btn11", "btn12", "btn19", "btn20", "btn21","false","big1"];
var topMiddle = [ "btn4", "btn5", "btn6", "btn13", "btn14", "btn15", "btn22", "btn23", "btn24","false","big2"];
var topRight = [ "btn7", "btn8", "btn9", "btn16", "btn17", "btn18", "btn25", "btn26", "btn27","false","big3"];
var centerLeft = [ "btn28", "btn29", "btn30", "btn37", "btn38", "btn39", "btn46", "btn47", "btn48","false","big4"];
var centerMiddle = [ "btn31", "btn32", "btn33", "btn40", "btn41", "btn42", "btn49", "btn50", "btn51","false","big5"];
var centerRight = [ "btn34", "btn35", "btn36", "btn43", "btn44", "btn45", "btn52", "btn53", "btn54","false","big6"];
var bottomLeft = [ "btn55", "btn56", "btn57", "btn64", "btn65", "btn66", "btn73", "btn74", "btn75","false","big7"];
var bottomMiddle = [ "btn58", "btn59", "btn60", "btn67", "btn68", "btn69", "btn76", "btn77", "btn78","false","big8"];
var bottomRight = [ "btn61", "btn62", "btn63", "btn70", "btn71", "btn72", "btn79", "btn80", "btn81","false","big9"];
var bigTable = ["big1","big2","big3","big4","big5","big6","big7","big8","big9","false"];
$(function() {
$(".btn").click(function()
{
        var identity = this.id;
        /* determines which array to check */
        if(contains(topLeft, identity)){
            if(topLeft[9] === "false"){
                horizontalCheck(topLeft);
                verticalCheck(topLeft);
                crossCheck(topLeft);
            }
        }
        else if(contains(topMiddle, identity)){
            if(topMiddle[9] === "false"){
                horizontalCheck(topMiddle);
                verticalCheck(topMiddle);
                crossCheck(topMiddle);
            }
        }
        else if(contains(topRight, identity)){
            if(topRight[9] === "false"){
                horizontalCheck(topRight);
                verticalCheck(topRight);
                crossCheck(topRight);
            }
        }
        else if(contains(centerLeft, identity)){
            if(centerLeft[9] === "false"){
                horizontalCheck(centerLeft);
                verticalCheck(centerLeft);
                crossCheck(centerLeft);
            }   }
        else if(contains(centerMiddle, identity)){
            if(centerMiddle[9] === "false"){
                horizontalCheck(centerMiddle);
                verticalCheck(centerMiddle);
                crossCheck(centerMiddle);
            }   }
        else if(contains(centerRight, identity)){
            if(centerRight[9] === "false"){
                horizontalCheck(centerRight);
                verticalCheck(centerRight);
                crossCheck(centerRight);
            }   }
        else if(contains(bottomLeft, identity)){
            if(bottomLeft[9] === "false"){
                horizontalCheck(bottomLeft);
                verticalCheck(bottomLeft);
                crossCheck(bottomLeft);
            }   }
        else if(contains(bottomMiddle, identity)){
            if(bottomMiddle[9] === "false"){
                horizontalCheck(bottomMiddle);
                verticalCheck(bottomMiddle);
                crossCheck(bottomMiddle);
            }   }
        else if(contains(bottomRight, identity)){
            if(bottomRight[9] === "false"){
                horizontalCheck(bottomRight);
                verticalCheck(bottomRight);
                crossCheck(bottomRight);
            }   }
        /**************************************/
        /* Checks if the major game is won by someone */
        horizontalCheck(bigTable);
        verticalCheck(bigTable);
        crossCheck(bigTable);
        if(bigTable[9] === "true"){
            alert("THE GAME HAS BEEN WON");
        }
        /**********************************************/
});
});

function contains(a, obj) {
    for (var i = 0; i < a.length; i++) {
        if (a[i] === obj) {
            return true;
        }
    }
    return false;
}
/* Checks horizontal wins*/
function horizontalCheck(b){
    if((document.getElementById(b[0]).text==="X"&&document.getElementById(b[1]).text==="X"&&document.getElementById(b[2]).text==="X")||
        (document.getElementById(b[3]).text==="X"&&document.getElementById(b[4]).text==="X"&&document.getElementById(b[5]).text==="X")||
        (document.getElementById(b[6]).text==="X"&&document.getElementById(b[7]).text==="X"&&document.getElementById(b[8]).text==="X")){
        console.log("X wins horizontally");
        b[9]= "true";
        if(b != bigTable)
        {
            document.getElementById(b[10]).innerHTML="X";
            document.getElementById(b[10]).text="X";
        }
    }


    else if((document.getElementById(b[0]).text==="O"&&document.getElementById(b[1]).text==="O"&&document.getElementById(b[2]).text==="O")||
        (document.getElementById(b[3]).text==="O"&&document.getElementById(b[4]).text==="O"&&document.getElementById(b[5]).text==="O")||
        (document.getElementById(b[6]).text==="O"&&document.getElementById(b[7]).text==="O"&&document.getElementById(b[8]).text==="O")){
        console.log("O wins horizontally");
        b[9]= "true";
        if(b != bigTable)
        {
            document.getElementById(b[10]).innerHTML="O";
            document.getElementById(b[10]).text="O";
        }
    }


}
/***********************/
/* Checks vertical wins*/
function verticalCheck(b){
    if((document.getElementById(b[0]).text==="X"&&document.getElementById(b[3]).text==="X"&&document.getElementById(b[6]).text==="X")||
        (document.getElementById(b[1]).text==="X"&&document.getElementById(b[4]).text==="X"&&document.getElementById(b[7]).text==="X")||
        (document.getElementById(b[2]).text==="X"&&document.getElementById(b[5]).text==="X"&&document.getElementById(b[8]).text==="X")){
        console.log("X wins vertically");
        b[9]= "true";
        if(b != bigTable)
        {
            document.getElementById(b[10]).innerHTML="X";
            document.getElementById(b[10]).text="X";
        }
    }

    else if((document.getElementById(b[0]).text==="O"&&document.getElementById(b[3]).text==="O"&&document.getElementById(b[6]).text==="O")||
        (document.getElementById(b[1]).text==="O"&&document.getElementById(b[4]).text==="O"&&document.getElementById(b[7]).text==="O")||
        (document.getElementById(b[2]).text==="O"&&document.getElementById(b[5]).text==="O"&&document.getElementById(b[8]).text==="O")){
        console.log("O wins vertically");
        b[9]= "true";
        if(b != bigTable)
        {
            document.getElementById(b[10]).innerHTML="O";
            document.getElementById(b[10]).text="O";
        }
    }


}
/***********************/
/* Checks cross wins*/
function crossCheck(b){
    if((document.getElementById(b[0]).text==="X"&&document.getElementById(b[4]).text==="X"&&document.getElementById(b[8]).text==="X")||
        (document.getElementById(b[2]).text==="X"&&document.getElementById(b[4]).text==="X"&&document.getElementById(b[6]).text==="X")){
        console.log("X wins crossly");
        b[9]= "true";
        if(b != bigTable)
        {
            document.getElementById(b[10]).innerHTML="X";
            document.getElementById(b[10]).text="X";
        }
    }

    else if((document.getElementById(b[0]).text==="O"&&document.getElementById(b[4]).text==="O"&&document.getElementById(b[8]).text==="O")||
        (document.getElementById(b[2]).text==="O"&&document.getElementById(b[4]).text==="O"&&document.getElementById(b[6]).text==="O")){
        console.log("O wins crossly");
        b[9]= "true";
        if(b != bigTable)
        {
            document.getElementById(b[10]).innerHTML="O";
            document.getElementById(b[10]).text="O";
        }
    }


}
/***********************/
