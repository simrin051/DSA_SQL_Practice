    public String removeDigit(String number, char digit) {
       String str = null;
        List<String> list = new ArrayList<String>();
        for(int i=0;i<number.length();i++) {
            if(number.charAt(i)==digit) {
      str = number.substring(0,i)+number.substring(i+1);
                list.add(str);
            }
        }
        Collections.sort(list);
        return list.get(list.size()-1);
    }
