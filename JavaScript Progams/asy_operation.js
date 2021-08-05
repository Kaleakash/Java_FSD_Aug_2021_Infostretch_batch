document.write("1st Statement")
//document.write("<br/>2nd Statement")
setTimeout(()=> {
    //document.write("<br> 2nd Statement")
    document.getElementById("obj1").innerHTML="<br/> 2nd Statement";
},2000);
var i=0;
var obj = setInterval(()=> {
    var obj = new Date();
    document.getElementById("obj2").innerHTML="<br> 4th Statement "+i;
document.getElementById("clock").innerHTML=obj.getHours()+" : "+obj.getMinutes()+" : "+obj.getSeconds()
    if(i%2==0){
            document.getElementById("msg").style.color="RED"
            document.getElementById("msg").style.backgroundColor="GREEN"
    }else {
        document.getElementById("msg").style.color="WHITE"
        document.getElementById("msg").style.backgroundColor="RED"
    }
i++;
},1000)
document.write("<br/>3rd Statement")
function stop() {
    clearInterval(obj);
}