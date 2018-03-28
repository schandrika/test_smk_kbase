
package us.kbase.chandrikasmktest;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * <p>Original spec-file type: QuerySmkInput</p>
 * <pre>
 * Insert your typespec information here.
 * </pre>
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "workspace_fn_param",
    "abundance_fn_param"
})
public class QuerySmkInput {

    @JsonProperty("workspace_fn_param")
    private String workspaceFnParam;
    @JsonProperty("abundance_fn_param")
    private Double abundanceFnParam;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("workspace_fn_param")
    public String getWorkspaceFnParam() {
        return workspaceFnParam;
    }

    @JsonProperty("workspace_fn_param")
    public void setWorkspaceFnParam(String workspaceFnParam) {
        this.workspaceFnParam = workspaceFnParam;
    }

    public QuerySmkInput withWorkspaceFnParam(String workspaceFnParam) {
        this.workspaceFnParam = workspaceFnParam;
        return this;
    }

    @JsonProperty("abundance_fn_param")
    public Double getAbundanceFnParam() {
        return abundanceFnParam;
    }

    @JsonProperty("abundance_fn_param")
    public void setAbundanceFnParam(Double abundanceFnParam) {
        this.abundanceFnParam = abundanceFnParam;
    }

    public QuerySmkInput withAbundanceFnParam(Double abundanceFnParam) {
        this.abundanceFnParam = abundanceFnParam;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return ((((((("QuerySmkInput"+" [workspaceFnParam=")+ workspaceFnParam)+", abundanceFnParam=")+ abundanceFnParam)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
