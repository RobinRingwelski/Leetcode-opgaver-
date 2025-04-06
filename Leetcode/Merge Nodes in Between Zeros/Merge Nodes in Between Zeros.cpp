/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
 class Solution {
    public:
        ListNode* mergeNodes(ListNode* head) {
            ListNode* dummy = new ListNode(0);
            ListNode* tail = dummy;
            ListNode* current = head->next; // Skipping the first 0 in the linked list
            int sum = 0;
    
            while (current != nullptr){
                if (current->val == 0){
                    // When it reaches 0 it is the end of a segment so we add a node with the sum of that segment
                    tail->next = new ListNode(sum);
                    tail = tail->next; // Move the tail to the next
                    sum = 0; // then reset the sum
                } else {
                    sum += current->val; // collect values between the segments
                }
                current = current->next; // moves to the next node
            }
            return dummy->next; // Return head of new list (skip the dummy node)
        }
    };