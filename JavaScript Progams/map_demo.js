let mm = new Map();
mm.set(1,"Ravi");
mm.set(3,"Ramesh");
mm.set(2,"Rajesh");
mm.set(5,"Lokesh");
mm.set(6,"Mahesh");
document.write(mm)
document.write("<br> size is "+mm.size)
mm.set(1,"Raju");   
mm.set(9,"Rajesh");
document.write("<br/>")
document.write("<br> size is "+mm.size)
document.write("<br/>Using key we can get value "+mm.get(2));
mm.forEach((v,k)=>document.write("<br/>Value is "+v+" Key is "+k));