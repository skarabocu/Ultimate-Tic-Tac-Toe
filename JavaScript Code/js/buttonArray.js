var NumberOfWords = 81//the length of the array

var buttons = new BuildArray(NumberOfWords)//creating the new array

// The varibles of the array

buttons[1] = "btn1"
buttons[2] = "btn2"
buttons[3] = "btn3"
buttons[4] = "btn4"
buttons[5] = "btn5"
buttons[6] = "btn6"
buttons[7] = "btn7"
buttons[8] = "btn8"
buttons[9] = "btn9"
buttons[10] = "btn10"
buttons[11] = "btn11"
buttons[12] = "btn12"
buttons[13] = "btn13"
buttons[14] = "btn14"
buttons[15] = "btn15"
buttons[16] = "btn16"
buttons[17] = "btn17"
buttons[18] = "btn18"
buttons[19] = "btn19"
buttons[20] = "btn20"
buttons[21] = "btn21"
buttons[22] = "btn22"
buttons[23] = "btn23"
buttons[24] = "btn24"
buttons[25] = "btn25"
buttons[26] = "btn26"
buttons[27] = "btn27"
buttons[28] = "btn28"
buttons[29] = "btn29"
buttons[30] = "btn30"
buttons[31] = "btn31"
buttons[32] = "btn32"
buttons[33] = "btn33"
buttons[34] = "btn34"
buttons[35] = "btn35"
buttons[36] = "btn36"
buttons[37] = "btn37"
buttons[38] = "btn38"
buttons[39] = "btn39"
buttons[40] = "btn40"
buttons[41] = "btn41"
buttons[42] = "btn42"
buttons[43] = "btn43"
buttons[44] = "btn44"
buttons[45] = "btn45"
buttons[46] = "btn46"
buttons[47] = "btn47"
buttons[48] = "btn48"
buttons[49] = "btn49"
buttons[50] = "btn50"
buttons[51] = "btn51"
buttons[52] = "btn52"
buttons[53] = "btn53"
buttons[54] = "btn54"
buttons[55] = "btn55"
buttons[56] = "btn56"
buttons[57] = "btn57"
buttons[58] = "btn58"
buttons[59] = "btn59"
buttons[60] = "btn60"
buttons[61] = "btn61"
buttons[62] = "btn62"
buttons[63] = "btn63"
buttons[64] = "btn64"
buttons[65] = "btn65"
buttons[66] = "btn66"
buttons[67] = "btn67"
buttons[68] = "btn68"
buttons[69] = "btn69"
buttons[70] = "btn70"
buttons[71] = "btn71"
buttons[72] = "btn72"
buttons[73] = "btn73"
buttons[74] = "btn74"
buttons[75] = "btn75"
buttons[76] = "btn76"
buttons[77] = "btn77"
buttons[78] = "btn78"
buttons[79] = "btn79"
buttons[80] = "btn80"
buttons[81] = "btn81"


function BuildArray(size){
    this.length = size
    for (var i = 1; i <= size; i++){
        this[i] = null}
    return this
}


