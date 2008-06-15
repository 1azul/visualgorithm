/*
 * AVLTree.java v1.00 19/05/08
 *
 * Visualgorithm
 * Copyright (C) Hannier, Pironin, Rigoni (visualgorithm@googlegroups.com)
 * 
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */

package model.datastructure.tree;

/**
 * Definition of AVL trees, with as node <tt>AVLNode</tt>.
 * 
 * @author Julien Hannier
 * @author Pierre Pironin
 * @author Damien Rigoni
 * @version 1.00 19/05/08
 * @see IAVLNode
 * @see IBinarySearchTree
 */
public class AVLTree extends AbstractBinarySearchTree<AVLNode> {

    /**
     * Builds an empty AVL tree.
     */
    public AVLTree() {
        root = null;
    }

    /**
     * Builds an AVL tree whose root is initialized with the specified key.
     * 
     * @param key the key of the root
     */
    public AVLTree(int key) {
        root = new AVLNode(key);
    }
}