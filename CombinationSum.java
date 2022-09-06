  public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> combinations=new ArrayList<>();
        findAllCombinations(nums,target,new ArrayList<>(),combinations,0);
        return combinations;
    }
    void findAllCombinations(int[] nums, int target,List<Integer> temp,List<List<Integer>> ans,int idx){
        if(target==0){
            List<Integer> combination=new ArrayList(temp);
            ans.add(combination);
            return;
        }
        for(int i=idx;i<nums.length;i++){
            if(nums[i]<=target){
                temp.add(nums[i]);
                findAllCombinations(nums,target-nums[i],temp,ans,i);
                temp.remove(temp.size()-1);
            }
        }
    }
