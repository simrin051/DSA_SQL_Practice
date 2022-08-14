function repeatedSubstringPattern(s: string): boolean {
    let temp: string = '';
    if(s.length==1) return false;
    for(let i=0;i<s.length/2;i++) {
        temp = temp + s.charAt(i);
        if(s.length%temp.length == 0) {
        let times = s.length/temp.length;
        let tempStr = temp.repeat(times);
        if(tempStr == s) return true;
        }
    }  
        return false;
};
