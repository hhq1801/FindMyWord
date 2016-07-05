println 'hello world!'

// read dict
File f = new File("ttt.txt")
def dict,ch
if (f.length() > 0){
   pids = new ArrayList()
   f.eachLine { line -> pids.add(line) }
   // println pids
   dict = pids;
}
else{
   println "File is empty!"
}

// read character list

f = new File("dict/ch.txt")

if (f.length() > 0){
   pids = new ArrayList()
   f.eachLine { line -> pids.add(line) }
  // println pids
   ch = pids;
}
else{
   println "File is empty!"
}
chlen = ch.size();
ret = new ArrayList()
dict.each {
	w ->
	
	wlen = w.size();
	i = 0;
	w.find {
		c ->
		if(ch.contains(c)){
			i++;
			return false;
		}  else {
			return true;
		}
	}
	
	if(i == wlen) {
		ret.add(w)
	}
	

}
println ret

