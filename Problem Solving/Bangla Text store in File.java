

BufferedReader read = new BufferedReader(new InputStreamReader(new FileInputStream("Input1.txt"), StandardCharsets.UTF_8));
Writer  writeFirst = new BufferedWriter(new OutputStreamWriter(new  FileOutputStream("Input.txt",true),StandardCharsets.UTF_16));
String str = null;
while (( str = read.readLine()) != null) {
    String[] words = str.split(" ");
    //do some task
    for(String s : words)
        writeFIrst.write(s);
}