#include <stdio.h>
#include "sum.h"
#include "unity.h"


void setUp(){
    printf("called before running each test case\n");
    printf("------------------------------------\n");
}
void tearDown(){
    printf("called after running each test case\n");
    printf("------------------------------------\n");
}
void test_sum_positive(){
    TEST_ASSERT_EQUAL(3,sum(1,2));
    TEST_ASSERT_EQUAL(10,sum(5,5));
}
void test_sum_negative(){
    TEST_ASSERT_EQUAL(-3,sum(-1,-2));
    TEST_ASSERT_EQUAL(-9,sum(-6,-3));
}
void test_null(){
    TEST_ASSERT_EQUAL(0,sum(0,0));
}
int main(){
    UNITY_BEGIN();
    RUN_TEST(test_sum_positive);
    RUN_TEST(test_sum_negative);
    RUN_TEST(test_null);
    return UNITY_END();
}