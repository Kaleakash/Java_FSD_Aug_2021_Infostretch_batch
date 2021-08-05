var ss = new Set();
ss.add(10);
ss.add(20);
ss.add(40);
ss.add(50);
ss.add(10);     // didn't store 
document.write(ss);
document.write("<br/> Size is "+ss.size)
document.write("<br/> Search "+ss.has(10));
document.write("<br/> Search "+ss.has(100));
ss.delete(20);  // delete elements using value 
document.write("<br/> Size is "+ss.size)
ss.forEach(v=>document.write("<br/> Value is "+v));
