/*
A KBase module: Chandrika_SMK_Test
*/

module Chandrika_SMK_Test {
    /*
        Insert your typespec information here.
    */
   typedef structure {
    string workspace_fn_param;
    float abundance_fn_param;
   }QuerySmkInput;


   typedef structure {
        string gene;
        float abundance;

    } TestResult;

    funcdef query_smk(QuerySmkInput query_input_fn_param)
        returns (list<TestResult> output) authentication required;
};
