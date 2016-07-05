PrintWriter writer = null

File f = new File("dict/百度分词词库.txt")

if (f.length() > 0){

   writer = new PrintWriter(new File('tmp.txt'))
   writer.println(f.getText('gbk'));
   writer.close()
}
else{
   println "File is empty!"
}