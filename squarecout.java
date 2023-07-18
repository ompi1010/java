import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
class gfg{
    static class Node
    {
        int val;
        ArrayList<Node>children;

        public Node(int val)
        {
            this.val=val;
            this.children=new ArrayList<Node>();
        }
    };
    static class pair
    {
        Node first;
        int second;
        public pair(Node node,int val)
        {
            this.first=node;
            this.second=val;
        }
    }
    static int evenOddLevelDifference(Node root)
    {
        int evenSum=0,oddSum=0;
        Queue<pair>q=new LinkedList<>();
        q.add(new pair(root,1));
        while(!q.isEmpty())
        {
            pair currNode=q.poll();
            int currLevel=currNode.second;
            int currval= currNode.first.val;
            if(currLevel%2==1)
            oddSum += currval;
            else
            evenSum += currval;
            for(Node child: currNode.first.children)
            {
                q.add(new pair(child,currLevel+1));
            }
        }
        return(oddSum-evenSum);
    }
    public static void main(String[] args)
    {
        Node root=new Node(4);
        root.children.add(new Node(2));
        root.children.add(new Node(3));
        root.children.add(new Node(-5));
        root.children.get(0).children.add(new Node(-1));
        root.children.get(0).children.add(new Node(3));
        root.children.get(2).children.add(new Node(-2));
        root.children.get(2).children.add(new Node(6));
        System.out.println(evenOddLevelDifference(root));
    }
}
