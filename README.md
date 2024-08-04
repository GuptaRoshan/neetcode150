## What is NeetCode 150?

Neetcode 150 offers a meticulously curated selection of 150 LeetCode challenges, strategically encompassing various data
structure topics.
This compilation serves as an indispensable aid for preparing for LeetCode-style interviews common in FAANG and other
prominent tech firms.
Organized into distinct categories, each comprising easy, medium, and hard questions, Neetcode 150 provides a
comprehensive study resource.

Creator's [original repository](https://github.com/neetcode-gh/leetcode) and [website](https://neetcode.io/).

## Arrays & Hashing

| LeetCode ID | Difficulty | Problem                                                                                     | Solution | Notes                                                                                           |
|-------------|------------|---------------------------------------------------------------------------------------------|----------|-------------------------------------------------------------------------------------------------|
| 217         | Easy       | [Contains Duplicate](https://leetcode.com/problems/contains-duplicate/)                     |          | Can be done using,`two loops, set, map and sorting`                                             |
| 242         | Easy       | [Valid Anagram](https://leetcode.com/problems/valid-anagram/)                               |          | can be done using, `sorting, count frequency, map`                                              |
| 1           | Easy       | [Two Sum](https://leetcode.com/problems/two-sum/)                                           |          | Using Map to store the difference between the `target and the current index`                    |
| 49          | Medium     | [Group Anagrams](https://leetcode.com/problems/group-anagrams/)                             |          | create map, sort each word, create key and put that word in map                                 |
| 347         | Medium     | [Top K Frequent Elements](https://leetcode.com/problems/top-k-frequent-elements/)           |          | create a frequency `map`, create `pair<k, v>` put into max priority queue, poll two elements    |
| 238         | Medium     | [Product of Array Except Self](https://leetcode.com/problems/product-of-array-except-self/) |          | create prefix product from 0th index and suffix from nth index, create product from both arrays |
| 36          | Medium     | [Valid Sudoku](https://leetcode.com/problems/valid-sudoku/)                                 |          | use set and create a string with `row, col and gridNumber = (i / 3) * 3 + (j / 3)`              |
| 271         | Medium     | [Encode and Decode Strings](https://leetcode.com/problems/encode-and-decode-strings/)       |          | Encode using `delimiter` and decode using string function                                       |
| 128         | Medium     | [Longest Consecutive Sequence](https://leetcode.com/problems/longest-consecutive-sequence/) |          | create a set and run two while loops, decrement(--) and increment(++) for each number           |

## Two Pointers

| LeetCode ID | Difficulty | Problem                                                                               | Solution | Notes                                                                                                                                                                                                                                 |
|-------------|------------|---------------------------------------------------------------------------------------|----------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| 125         | Easy       | [Valid Palindrome](https://leetcode.com/problems/valid-palindrome/)                   |          | Two pointers                                                                                                                                                                                                                          |
| 167         | Medium     | [Two Sum II](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/)         |          | Move left pointer if current sum is less than target else right                                                                                                                                                                       |
| 15          | Medium     | [3Sum](https://leetcode.com/problems/3sum/)                                           |          | First value fixed, then follow two sum solution                                                                                                                                                                                       |
| 11          | Medium     | [Container with Most Water](https://leetcode.com/problems/container-with-most-water/) |          | Calculate area = h * w, Move left pointer if left value is less than right value else right pointer                                                                                                                                   |
| 42          | Hard       | [Trapping Rain Water](https://leetcode.com/problems/trapping-rain-water/)             |          | calculate `leftMax and rightMax`, if `leftMax < rightMax` : water can be trapped in the left section else right section `leftMax - height[left] and rightMax - height[right]` : No. of units can be trapped in left and right section |

## Sliding Window

| LeetCode ID | Difficulty | Problem                                                                                                                         | Solution | Notes                                                                                                |
|-------------|------------|---------------------------------------------------------------------------------------------------------------------------------|----------|------------------------------------------------------------------------------------------------------|
| 121         | Easy       | [Best Time to Buy & Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/)                                 |          | Calculate the min value min(buy value)                                                               |
| 3           | Medium     | [Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/) |          | Used map or set to store unique characters, window size = (right - left + 1)                         |
| 424         | Medium     | [Longest Repeating Character Replacement](https://leetcode.com/problems/longest-repeating-character-replacement/)               |          | get the most frequent letter, minus with window size if difference exceeds k, then shrink the window |
| 567         | Medium     | [Permutation in String](https://leetcode.com/problems/permutation-in-string/)                                                   |          | minus and plus in frequency count of string  s1 and s2                                               |
| 76          | Hard       | [Minimum Window Substring](https://leetcode.com/problems/minimum-window-substring/)                                             |          | Commented on Solution                                                                                |
| 239         | Hard       | [Sliding Window Maximum](https://leetcode.com/problems/sliding-window-maximum/)                                                 |          | Implemented Bruteforce solution, can be done using `deque`                                           |

## Stack

| LeetCode ID | Difficulty | Problem                                                                                             | Solution | Notes                                                |
|-------------|------------|-----------------------------------------------------------------------------------------------------|----------|------------------------------------------------------|
| 20          | Easy       | [Valid Parentheses](https://leetcode.com/problems/valid-parentheses/)                               |          | Simple Stack                                         |
| 155         | Medium     | [Min Stack](https://leetcode.com/problems/min-stack/)                                               |          | Create linked list with min value and insert at head |
| 150         | Medium     | [Evaluate Reverse Polish Notation](https://leetcode.com/problems/evaluate-reverse-polish-notation/) |          | Done                                                 |
| 22          | Medium     | [Generate Parentheses](https://leetcode.com/problems/generate-parentheses/)                         |          | can be done using backtracking, more elegant         |
| 739         | Medium     | [Daily Temperatures](https://leetcode.com/problems/daily-temperatures/)                             |          | Done using monotonic stack                           |
| 853         | Medium     | [Car Fleet](https://leetcode.com/problems/car-fleet/)                                               |          | Simple Stack                                         |
| 84          | Hard       | [Largest Rectangle in Histogram](https://leetcode.com/problems/largest-rectangle-in-histogram/)     |          | Can be done using increasing `monotonic stack`       |

## Binary Search

| LeetCode ID | Difficulty | Problem                                                                                                     | Solution | Notes                                                                                   |
|-------------|------------|-------------------------------------------------------------------------------------------------------------|----------|-----------------------------------------------------------------------------------------|
| 704         | Easy       | [Binary Search](https://leetcode.com/problems/binary-search/)                                               |          | Normal Binary Search                                                                    |
| 74          | Medium     | [Search a 2D Matrix](https://leetcode.com/problems/search-a-2d-matrix/)                                     |          | Thinking matrix as sorted array                                                         |
| 875         | Medium     | [Koko Eating Bananas](https://leetcode.com/problems/koko-eating-bananas/)                                   |          | Finding speed based hours given                                                         |
| 33          | Medium     | [Search in Rotated Sorted Array](https://leetcode.com/problems/search-in-rotated-sorted-array/)             |          | Find the smallest element in rotated array, normal binary search in in sorted sub-array |
| 153         | Medium     | [Find Minimum in Rotated Sorted Array](https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/) |          | Smallest element in rotated array `nums[mid] <= nums[high]`                             |
| 981         | Medium     | [Time Based Key-Value Store](https://leetcode.com/problems/time-based-key-value-store/)                     |          | Solved using binary search, return the target or just smaller element than target       |
| 4           | Hard       | [Median of Two Sorted Arrays](https://leetcode.com/problems/median-of-two-sorted-arrays/)                   |          |                                                                                         |

## Linked List


| LeetCode ID | Difficulty | Problem                                                                                             | Solution                                                                                               | Notes                                                                                                  |
|-------------|------------|-----------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------|
| 206         | Easy       | [Reverse Linked List](https://leetcode.com/problems/reverse-linked-list/)                           | https://github.com/GuptaRoshan/neetcode150/blob/main/src/linkedList/ReverseLinkedList_206.java         | Using three pointers, in recursion maintain value of two nodes in function call, first and second node |
| 21          | Easy       | [Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/)                     | https://github.com/GuptaRoshan/neetcode150/blob/main/src/linkedList/MergeTwoSortedLists_21.java        | solved using dummy node and two pointers, in recursion use divide and conquer                          |
| 143         | Medium     | [Reorder List](https://leetcode.com/problems/reorder-list/)                                         | https://github.com/GuptaRoshan/neetcode150/blob/main/src/linkedList/ReorderList_143.java               | 1. Find middle, 2. Reverse second half, 3.Reorder from both the head                                   |
| 19          | Medium     | [Remove Nth Node From End of List](https://leetcode.com/problems/remove-nth-node-from-end-of-list/) | https://github.com/GuptaRoshan/neetcode150/blob/main/src/linkedList/RemoveNthNodeFromEnd_19.java       | Fast and slow pointers, first move slow nth times and the move slow and first one step                 |
| 138         | Easy       | [Copy List with Random Pointer](https://leetcode.com/problems/copy-list-with-random-pointer/)       | https://github.com/GuptaRoshan/neetcode150/blob/main/src/linkedList/CopyListWithRandomPointer_138.java | Implemented using hashmap                                                                              |
| 2           | Medium     | [Add Two Numbers](https://leetcode.com/problems/add-two-numbers/)                                   | https://github.com/GuptaRoshan/neetcode150/blob/main/src/linkedList/AddTwoNumber_2.java                | List is already in reverse status, loop and calculate sum and carry                                    |
| 141         | Easy       | [Linked List Cycle](https://leetcode.com/problems/linked-list-cycle/)                               | https://github.com/GuptaRoshan/neetcode150/blob/main/src/linkedList/LinkedListCycle_141.java           | Floyd's Tortoise and Hare algorithm                                                                    |
| 287         | Medium     | [Find the Duplicate Number](https://leetcode.com/problems/find-the-duplicate-number/)               | https://github.com/GuptaRoshan/neetcode150/blob/main/src/linkedList/DuplicateNumber_287.java           | Floyd's Tortoise and Hare algorithm.                                                                   |
| 146         | Medium     | [LRU Cache](https://leetcode.com/problems/lru-cache/)                                               | https://github.com/GuptaRoshan/neetcode150/blob/main/src/linkedList/LRUCache_146.java                  | Can be solved using doubly linked list                                                                 |
| 23          | Hard       | [Merge k Sorted Lists](https://leetcode.com/problems/merge-k-sorted-lists/)                         | https://github.com/GuptaRoshan/neetcode150/blob/main/src/linkedList/MergeKSortedLists_23.java          | Can be solved using priority queue                                                                     |
| 25          | Hard       | [Reverse Nodes in k-Group](https://leetcode.com/problems/reverse-nodes-in-k-group/)                 | https://github.com/GuptaRoshan/neetcode150/blob/main/src/linkedList/ReverseNodesInKGroup_25.java       | Done using n pointers                                                                                  |

## Trees


| LeetCode ID | Difficulty | Problem                                                                                                                                               | Solution                                                                                        | Notes                           |
|-------------|------------|-------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------|---------------------------------|
| 226         | Easy       | [Invert Binary Tree](https://leetcode.com/problems/invert-binary-tree/)                                                                               | https://github.com/GuptaRoshan/neetcode150/blob/main/src/trees/InvertBinaryTree_226.java        | Solved using preorder traversal |
| 104         | Easy       | [Maximum Depth of Binary Tree](https://leetcode.com/problems/maximum-depth-of-binary-tree/)                                                           | https://github.com/GuptaRoshan/neetcode150/blob/main/src/trees/MaxDepthOfBinaryTree_104.java    |                                 |
| 543         | Easy       | [Diameter of Binary Tree](https://leetcode.com/problems/diameter-of-binary-tree/)                                                                     | https://github.com/GuptaRoshan/neetcode150/blob/main/src/trees/DiameterBinaryTree_543.java      |                                 |
| 110         | Easy       | [Balanced Binary Tree](https://leetcode.com/problems/balanced-binary-tree/)                                                                           | https://github.com/GuptaRoshan/neetcode150/blob/main/src/trees/BalancedBinaryTree_110.java      |                                 |
| 100         | Easy       | [Same Tree](https://leetcode.com/problems/same-tree/)                                                                                                 | https://github.com/GuptaRoshan/neetcode150/blob/main/src/trees/SameTree_100.java                |                                 |
| 572         | Easy       | [Subtree Of Another Tree](https://leetcode.com/problems/subtree-of-another-tree/)                                                                     | https://github.com/GuptaRoshan/neetcode150/blob/main/src/trees/SubtreeOfAnotherTree_572.java    |                                 |
| 235         | Medium     | [Lowest Common Ancestor Of A Binary Search Tree](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/)                       | https://github.com/GuptaRoshan/neetcode150/blob/main/src/trees/LowestCommonAncestorBST_235.java |                                 |
| 102         | Medium     | [Binary Tree Level Order Traversal](https://leetcode.com/problems/binary-tree-level-order-traversal/)                                                 | https://github.com/GuptaRoshan/neetcode150/blob/main/src/trees/LevelOrderTraversal_102.java     |                                 |
| 199         | Medium     | [Binary Tree Right Side View](https://leetcode.com/problems/binary-tree-right-side-view/)                                                             | https://github.com/GuptaRoshan/neetcode150/blob/main/src/trees/RightSideView_199.java           |                                 |
| 1448        | Medium     | [Count Good Nodes in Binary Tree](https://leetcode.com/problems/count-good-nodes-in-binary-tree/)                                                     | https://github.com/GuptaRoshan/neetcode150/blob/main/src/trees/CountGoodNodes_1448.java         |                                 |
| 98          | Medium     | [Validate Binary Search Tree](https://leetcode.com/problems/validate-binary-search-tree/)                                                             | https://github.com/GuptaRoshan/neetcode150/blob/main/src/trees/ValidateBST_98.java              |                                 |
| 230         | Medium     | [Kth Smallest Element in a BST](https://leetcode.com/problems/kth-smallest-element-in-a-bst/)                                                         | https://github.com/GuptaRoshan/neetcode150/blob/main/src/trees/KthSmallestInBST_230.java        |                                 |
| 105         | Medium     | [Construct Binary Tree from Preorder and Inorder Traversal](https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/) |                                                                                                 |                                 |
| 124         | Hard       | [Binary Tree Maximum Path Sum](https://leetcode.com/problems/binary-tree-maximum-path-sum/)                                                           |                                                                                                 |                                 |
| 297         | Hard       | [Serialize and Deserialize Binary Tree](https://leetcode.com/problems/serialize-and-deserialize-binary-tree/)                                         |                                                                                                 |                                 |

## Tries

| LeetCode ID | Difficulty | Problem                                                                                                                 | Solution | Notes |
|-------------|------------|-------------------------------------------------------------------------------------------------------------------------|----------|-------|
| 208         | Medium     | [Implement Trie (Prefix Tree)](https://leetcode.com/problems/implement-trie-prefix-tree/)                               |          |       |
| 211         | Medium     | [Design Add and Search Words Data Structure](https://leetcode.com/problems/design-add-and-search-words-data-structure/) |          |       |
| 212         | Hard       | [Word Search II](https://leetcode.com/problems/word-search-ii/)                                                         |          |       |

## Heap / Priority Queue

| LeetCode ID | Difficulty | Problem                                                                                           | Solution | Notes |
|-------------|------------|---------------------------------------------------------------------------------------------------|----------|-------|
| 703         | Easy       | [Kth Largest Element in a Stream](https://leetcode.com/problems/kth-largest-element-in-a-stream/) |          |       |
| 1046        | Easy       | [Last Stone Weight](https://leetcode.com/problems/last-stone-weight/)                             |          |       |
| 973         | Medium     | [K Closest Points to Origin](https://leetcode.com/problems/k-closest-points-to-origin/)           |          |       |
| 215         | Medium     | [Kth Largest Element in an Array](https://leetcode.com/problems/kth-largest-element-in-an-array/) |          |       |
| 621         | Medium     | [Task Scheduler](https://leetcode.com/problems/task-scheduler/)                                   |          |       |
| 355         | Medium     | [Design Twitter](https://leetcode.com/problems/design-twitter/)                                   |          |       |
| 295         | Hard       | [Find Median from Data Stream](https://leetcode.com/problems/find-median-from-data-stream/)       |          |       |

## Backtracking

| LeetCode ID | Difficulty | Problem                                                                                                       | Solution | Notes |
|-------------|------------|---------------------------------------------------------------------------------------------------------------|----------|-------|
| 78          | Medium     | [Subsets](https://leetcode.com/problems/subsets/)                                                             |          |       |
| 39          | Medium     | [Combination Sum](https://leetcode.com/problems/combination-sum/)                                             |          |       |
| 46          | Medium     | [Permutations](https://leetcode.com/problems/permutations/)                                                   |          |       |
| 90          | Medium     | [Subsets II](https://leetcode.com/problems/subsets-ii/)                                                       |          |       |
| 40          | Medium     | [Combination Sum II](https://leetcode.com/problems/combination-sum-ii/)                                       |          |       |
| 79          | Medium     | [Word Search](https://leetcode.com/problems/word-search/)                                                     |          |       |
| 131         | Medium     | [Palindrome Partitioning](https://leetcode.com/problems/palindrome-partitioning/)                             |          |       |
| 17          | Medium     | [Letter Combinations of a Phone Number](https://leetcode.com/problems/letter-combinations-of-a-phone-number/) |          |       |
| 51          | Hard       | [N-Queens](https://leetcode.com/problems/n-queens/)                                                           |          |       |

## Graphs

| LeetCode ID | Difficulty | Problem                                                                                                                                       | Solution | Notes |
|-------------|------------|-----------------------------------------------------------------------------------------------------------------------------------------------|----------|-------|
| 200         | Medium     | [Number of Islands](https://leetcode.com/problems/number-of-islands/)                                                                         |          |       |
| 133         | Medium     | [Clone Graph](https://leetcode.com/problems/clone-graph/)                                                                                     |          |       |
| 695         | Medium     | [Max Area of Island](https://leetcode.com/problems/max-area-of-island/)                                                                       |          |       |
| 417         | Medium     | [Pacific Atlantic Water Flow](https://leetcode.com/problems/pacific-atlantic-water-flow/)                                                     |          |       |
| 130         | Medium     | [Surrounded Regions](https://leetcode.com/problems/surrounded-regions/)                                                                       |          |       |
| 994         | Medium     | [Rotting Oranges](https://leetcode.com/problems/rotting-oranges/)                                                                             |          |       |
| 286         | Medium     | [Walls and Gates](https://leetcode.com/problems/walls-and-gates/)                                                                             |          |       |
| 207         | Medium     | [Course Schedule](https://leetcode.com/problems/course-schedule/)                                                                             |          |       |
| 210         | Medium     | [Course Schedule II](https://leetcode.com/problems/course-schedule-ii/)                                                                       |          |       |
| 684         | Medium     | [Redundant Connection](https://leetcode.com/problems/redundant-connection/)                                                                   |          |       |
| 323         | Medium     | [Number of Connected Components In An Undirected Graph](https://leetcode.com/problems/number-of-connected-components-in-an-undirected-graph/) |          |       |
| 261         | Medium     | [Graph Valid Tree](https://leetcode.com/problems/graph-valid-tree/)                                                                           |          |       |
| 127         | Hard       | [Word Ladder](https://leetcode.com/problems/word-ladder/)                                                                                     |          |       |

## Advanced Graphs

| LeetCode ID | Difficulty | Problem                                                                                           | Solution | Notes |
|-------------|------------|---------------------------------------------------------------------------------------------------|----------|-------|
| 332         | Hard       | [Reconstruct Itinerary](https://leetcode.com/problems/reconstruct-itinerary/)                     |          |       |
| 1584        | Medium     | [Min Cost to Connect All Points](https://leetcode.com/problems/min-cost-to-connect-all-points/)   |          |       |
| 743         | Medium     | [Network Delay Time](https://leetcode.com/problems/network-delay-time/)                           |          |       |
| 778         | Hard       | [Swim in Rising Water](https://leetcode.com/problems/swim-in-rising-water/)                       |          |       |
| 269         | Hard       | [Alien Dictionary](https://leetcode.com/problems/alien-dictionary/)                               |          |       |
| 787         | Medium     | [Cheapest Flights Within K Stops](https://leetcode.com/problems/cheapest-flights-within-k-stops/) |          |       |

## 1-D Dynamic Programming

| LeetCode ID | Difficulty | Problem                                                                                         | Solution | Notes |
|-------------|------------|-------------------------------------------------------------------------------------------------|----------|-------|
| 70          | Easy       | [Climbing Stairs](https://leetcode.com/problems/climbing-stairs/)                               |          |       |
| 746         | Easy       | [Min Cost Climbing Stairs](https://leetcode.com/problems/min-cost-climbing-stairs/)             |          |       |
| 198         | Medium     | [House Robber](https://leetcode.com/problems/house-robber/)                                     |          |       |
| 213         | Medium     | [House Robber II](https://leetcode.com/problems/house-robber-ii/)                               |          |       |
| 5           | Medium     | [Longest Palindromic Substring](https://leetcode.com/problems/longest-palindromic-substring/)   |          |       |
| 647         | Medium     | [Palindromic Substrings](https://leetcode.com/problems/palindromic-substrings/)                 |          |       |
| 91          | Medium     | [Decode Ways](https://leetcode.com/problems/decode-ways/)                                       |          |       |
| 322         | Medium     | [Coin Change](https://leetcode.com/problems/coin-change/)                                       |          |       |
| 152         | Medium     | [Maximum Product Subarray](https://leetcode.com/problems/maximum-product-subarray/)             |          |       |
| 139         | Medium     | [Word Break](https://leetcode.com/problems/word-break/)                                         |          |       |
| 300         | Medium     | [Longest Increasing Subsequence](https://leetcode.com/problems/longest-increasing-subsequence/) |          |       |
| 416         | Medium     | [Partition Equal Subset Sum](https://leetcode.com/problems/partition-equal-subset-sum/)         |          |       |

## 2-D Dynamic Programing

| LeetCode ID | Difficulty | Problem                                                                                                                       | Solution | Notes |
|-------------|------------|-------------------------------------------------------------------------------------------------------------------------------|----------|-------|
| 62          | Medium     | [Unique Paths](https://leetcode.com/problems/unique-paths/)                                                                   |          |       |
| 1143        | Medium     | [Longest Common Subsequence](https://leetcode.com/problems/longest-common-subsequence/)                                       |          |       |
| 309         | Medium     | [Best Time to Buy and Sell Stock with Cooldown](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/) |          |       |
| 518         | Medium     | [Coin Change II](https://leetcode.com/problems/coin-change-ii/)                                                               |          |       |
| 494         | Medium     | [Target Sum](https://leetcode.com/problems/target-sum/)                                                                       |          |       |
| 97          | Medium     | [Interleaving String](https://leetcode.com/problems/interleaving-string/)                                                     |          |       |
| 329         | Hard       | [Longest Increasing Path in a Matrix](https://leetcode.com/problems/longest-increasing-path-in-a-matrix/)                     |          |       |
| 115         | Hard       | [Distinct Subsequences](https://leetcode.com/problems/distinct-subsequences/)                                                 |          |       |
| 72          | Hard       | [Edit Distance](https://leetcode.com/problems/edit-distance/)                                                                 |          |       |
| 312         | Hard       | [Burst Balloons](https://leetcode.com/problems/burst-balloons/)                                                               |          |       |
| 10          | Hard       | [Regular Expression Matching](https://leetcode.com/problems/regular-expression-matching/)                                     |          |       |

## Greedy

| LeetCode ID | Difficulty | Problem                                                                                                       | Solution | Notes |
|-------------|------------|---------------------------------------------------------------------------------------------------------------|----------|-------|
| 53          | Medium     | [Maximum Subarray](https://leetcode.com/problems/maximum-subarray/)                                           |          |       |
| 55          | Medium     | [Jump Game](https://leetcode.com/problems/jump-game/)                                                         |          |       |
| 45          | Medium     | [Jump Game II](https://leetcode.com/problems/jump-game-ii/)                                                   |          |       |
| 134         | Medium     | [Gas Station](https://leetcode.com/problems/gas-station/)                                                     |          |       |
| 846         | Medium     | [Hand of Straights](https://leetcode.com/problems/hand-of-straights/)                                         |          |       |
| 1899        | Medium     | [Merge Triplets to Form Target Triplet](https://leetcode.com/problems/merge-triplets-to-form-target-triplet/) |          |       |
| 763         | Medium     | [Partition Labels](https://leetcode.com/problems/partition-labels/)                                           |          |       |
| 678         | Medium     | [Valid Parenthesis String](https://leetcode.com/problems/valid-parenthesis-string/)                           |          |       |

## Intervals

| LeetCode ID | Difficulty | Problem                                                                                                         | Solution | Notes |
|-------------|------------|-----------------------------------------------------------------------------------------------------------------|----------|-------|
| 57          | Medium     | [Insert Interval](https://leetcode.com/problems/insert-interval/)                                               |          |       |
| 56          | Medium     | [Merge Intervals](https://leetcode.com/problems/merge-intervals/)                                               |          |       |
| 435         | Medium     | [Non-overlapping Intervals](https://leetcode.com/problems/non-overlapping-intervals/)                           |          |       |
| 252         | Easy       | [Meeting Rooms](https://leetcode.com/problems/meeting-rooms/)                                                   |          |       |
| 253         | Medium     | [Meeting Rooms II](https://leetcode.com/problems/meeting-rooms-ii/)                                             |          |       |
| 1851        | Hard       | [Minimum Interval to Include Each Query](https://leetcode.com/problems/minimum-interval-to-include-each-query/) |          |       |

## Math & Geometry

| LeetCode ID | Difficulty | Problem                                                               | Solution | Notes |
|-------------|------------|-----------------------------------------------------------------------|----------|-------|
| 48          | Medium     | [Rotate Image](https://leetcode.com/problems/rotate-image/)           |          |       |
| 54          | Medium     | [Spiral Matrix](https://leetcode.com/problems/spiral-matrix/)         |          |       |
| 73          | Medium     | [Set Matrix Zeroes](https://leetcode.com/problems/set-matrix-zeroes/) |          |       |
| 202         | Easy       | [Happy Number](https://leetcode.com/problems/happy-number/)           |          |       |
| 66          | Easy       | [Plus One](https://leetcode.com/problems/plus-one/)                   |          |       |
| 50          | Medium     | [Pow(x, n)](https://leetcode.com/problems/powx-n/)                    |          |       |
| 43          | Medium     | [Multiply Strings](https://leetcode.com/problems/multiply-strings/)   |          |       |
| 2013        | Medium     | [Detect Squares](https://leetcode.com/problems/detect-squares/)       |          |       |

## Bit Manipulation

| LeetCode ID | Difficulty | Problem                                                                   | Solution | Notes |
|-------------|------------|---------------------------------------------------------------------------|----------|-------|
| 136         | Easy       | [Single Number](https://leetcode.com/problems/single-number/)             |          |       |
| 191         | Easy       | [Number of 1 Bits](https://leetcode.com/problems/number-of-1-bits/)       |          |       |
| 338         | Easy       | [Counting Bits](https://leetcode.com/problems/counting-bits/)             |          |       |
| 190         | Easy       | [Reverse Bits](https://leetcode.com/problems/reverse-bits/)               |          |       |
| 268         | Easy       | [Missing Number](https://leetcode.com/problems/missing-number/)           |          |       |
| 371         | Medium     | [Sum of Two Integers](https://leetcode.com/problems/sum-of-two-integers/) |          |       |
| 7           | Medium     | [Reverse Integer](https://leetcode.com/problems/reverse-integer/)         |          |       |

