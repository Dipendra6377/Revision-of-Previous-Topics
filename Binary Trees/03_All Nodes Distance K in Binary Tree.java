class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        HashMap<TreeNode,TreeNode> link =new HashMap<>();
        connections(root,link);
        HashMap<TreeNode,Boolean> vis=new HashMap<>();
        Queue<TreeNode> q=new LinkedList<>();
        List<Integer> list=new ArrayList<>();

        q.add(target);
        vis.put(target,true);
        int curtarget=0;
        while(!q.isEmpty()){
            int size=q.size();

            if(curtarget++ == k) break;

            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();

                if(curr.left!=null && vis.get(curr.left)==null){
                    q.add(curr.left);
                    vis.put(curr.left,true);
                }
                if(curr.right!=null && vis.get(curr.right)==null){
                    q.add(curr.right);
                    vis.put(curr.right,true);
                }
                if(link.get(curr)!=null && vis.get(link.get(curr))==null){
                    q.add(link.get(curr));
                    vis.put(link.get(curr),true);
                }
            }
        }
        while(!q.isEmpty()){
            list.add(q.peek().val);
            q.poll();
        }
        return list;
    }

    public void connections(TreeNode root,HashMap<TreeNode,TreeNode> link){
        Queue<TreeNode> q=new LinkedList<>();
        
        q.add(root);

        while(!q.isEmpty()){
            TreeNode temp=q.peek();
            q.poll();
            if(temp.left!=null){
                link.put(temp.left,temp);
                q.offer(temp.left);
            }
            if(temp.right!=null){
                link.put(temp.right,temp);
                q.offer(temp.right);
            }
        }
    }
}
