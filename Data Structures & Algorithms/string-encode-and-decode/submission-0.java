class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded=new StringBuilder();
        for(String str:strs)
        encoded.append(str.length()).append('#').append(str);
        return encoded.toString();


    }

    public List<String> decode(String str) {
            List<String> result=new ArrayList();
            int index=0;
            while(index<str.length()){
                int sepeartorIndex=str.indexOf('#',index);
                int length=Integer.parseInt(str.substring(index,sepeartorIndex));
                index=sepeartorIndex+1;
                result.add(str.substring(index,index+length));
                index+=length;
            }
            return result;
    }
}
