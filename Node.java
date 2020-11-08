public class Node
{
    private float key;
    private float value;
    private Node left;
    private Node right;

    public Node()
    {
        key = 0;
        value = 0;
        left = null;
        right = null;

    }

    public Node(float k, float v, Node l, Node r)
    {
        key = k;
        value = v;
        left = l;
        right = r;

    }

    public boolean isLeaf()
    {
        return (left == null && right == null);
    }

    // --------Left and Right Functions for set and get----
    public Node getLeft()
    {
        return left;
    }
    public Node getRight()
    {
        return left;
    }
    public void setRight(Node x)
    {
        right = x;
    }
    public void setLeft(Node x)
    {
        left = x;
    }
    // --------key and value Functions for set and get----
    public float getKey()
    {
        return key;
    }
    public Float getValue()
    {
        return value;
    }
    public void setKey(Float x)
    {
        key = x;
    }
    public void setValue(Float x)
    {
        value = x;
    }


}