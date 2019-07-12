package android.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new com.troy379.databindingexample.DataBinderMapperImpl());
  }
}
