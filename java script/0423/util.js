const checkJumin = (strJumin) => {
               
    let char = strJumin.slice(0,6) + strJumin.slice(7,13);
    let last = strJumin.slice(13,14);
    /*strJumin1 = strJumin.replace('-','');
    console.log(strJumin1);
    let num01 = Number(strJumin1.substring(0,1)*2);
    console.log(num01);
    */
    let n1 = Number(char.slice(0,1))* 2; 
    let n2 = Number(char.slice(1,2))* 3; 
    let n3 = Number(char.slice(2,3))* 4; 
    let n4 = Number(char.slice(3,4))* 5; 
    let n5 = Number(char.slice(4,5))* 6; 
    let n6 = Number(char.slice(5,6))* 7; 
    let n7 = Number(char.slice(6,7))* 8; 
    let n8 = Number(char.slice(7,8))* 9; 
    let n9 = Number(char.slice(8,9))* 2; 
    let n10 = Number(char.slice(9,10))* 3; 
    let n11 = Number(char.slice(10,11))* 4; 
    let n12 = Number(char.slice(11,12))* 5;
    let n = n1+n2+n3+n4+n5+n6+n7+n8+n9+n10+n11+n12;

    let n13 = (11-(n%11))%10
    if(last == n13){
        return true;
        // console.log("맞다");
    }else{
        return false;
    }
}