

def buildTree(preorder, inorder):
    if len(inorder) == 0:
         return None
    root = Treenode(preorder[0])
    mid = inorder.index(preorder[0])
    root.left = buildTree(preorder[1:mid+1], inorder[:mid])
    root.right = buildTree(preorder[mid + 1:], inorder[mid + 1:])
    return root

print(buildTree(preorder = [3,9,20,15,7],inorder = [9,3,15,20,7]))
            
