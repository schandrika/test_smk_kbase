# -*- coding: utf-8 -*-
#BEGIN_HEADER
import datetime
from pymongo import MongoClient
from bson import ObjectId
import os
#END_HEADER


class Chandrika_SMK_Test:
    '''
    Module Name:
    Chandrika_SMK_Test

    Module Description:
    A KBase module: Chandrika_SMK_Test
    '''

    ######## WARNING FOR GEVENT USERS ####### noqa
    # Since asynchronous IO can lead to methods - even the same method -
    # interrupting each other, you must be *very* careful when using global
    # state. A method could easily clobber the state set by another while
    # the latter method is running.
    ######################################### noqa
    VERSION = "0.0.1"
    GIT_URL = ""
    GIT_COMMIT_HASH = ""

    #BEGIN_CLASS_HEADER
    #END_CLASS_HEADER

    # config contains contents of config file in a hash or None if it couldn't
    # be found
    def __init__(self, config):
        #BEGIN_CONSTRUCTOR

        # os.system("mongod --version")
        # client = MongoClient("mongodb://127.0.0.1:27017")
        # #os.system("sudo /usr/sbin/service mongodb start")
        # self.db = client["test"]
        # self.db["metagenomics"].insert({"gene":1, "abundance":0.1})
        # self.db["metagenomics"].insert({"gene": 2, "abundance": 0.2})
        # self.db["metagenomics"].insert({"gene": 3, "abundance": 0.3})

        client = MongoClient("mongodb://dev:smkdev@18.188.149.177"
                             "/smk_dev")
        self.db = client.get_database()

        #END_CONSTRUCTOR
        pass


    def query_smk(self, ctx, query_input_fn_param):
        """
        :param query_input_fn_param: instance of type "QuerySmkInput" (Insert
           your typespec information here.) -> structure: parameter
           "workspace_fn_param" of String, parameter "abundance_fn_param" of
           Double
        :returns: instance of list of type "TestResult" -> structure:
           parameter "gene" of String, parameter "abundance" of Double
        """
        # ctx is the context object
        # return variables are: output
        #BEGIN query_smk
        cursor = self.db['metagenomics'].find(
            {"abundance": {"$gte": query_input_fn_param["abundance_fn_param"]}},
            {"gene":1, "abundance":1})
        output = list(cursor)

        #END query_smk

        # At some point might do deeper type checking...
        if not isinstance(output, list):
            raise ValueError('Method query_smk return value ' +
                             'output is not type list as required.')
        # return the results
        return [output]
    def status(self, ctx):
        #BEGIN_STATUS
        returnVal = {'state': "OK",
                     'message': "",
                     'version': self.VERSION,
                     'git_url': self.GIT_URL,
                     'git_commit_hash': self.GIT_COMMIT_HASH}
        #END_STATUS
        return [returnVal]
