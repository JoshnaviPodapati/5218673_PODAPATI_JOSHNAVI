#include "unity.h"
#include "evenorodd.h"

void setUp(void){
    printf("called before running each test case\n");
    printf("------------------------------------\n");
}
void tearDown(void){
    printf("called after running each test case\n");
    printf("------------------------------------\n");
}
void test_is_even(void){
    TEST_ASSERT_TRUE(is_even(2));
    TEST_ASSERT_TRUE(is_even(0));
    TEST_ASSERT_FALSE(is_even(3));
    TEST_ASSERT_FALSE(is_even(-1));
}
void test_is_odd(void){
    TEST_ASSERT_TRUE(is_odd(3));
    TEST_ASSERT_TRUE(is_odd(-1));
    TEST_ASSERT_FALSE(is_odd(2));
    TEST_ASSERT_FALSE(is_odd(0));
}
int main(void){
    UNITY_BEGIN();
    RUN_TEST(test_is_even);
    RUN_TEST(test_is_odd);
    return UNITY_END();
}