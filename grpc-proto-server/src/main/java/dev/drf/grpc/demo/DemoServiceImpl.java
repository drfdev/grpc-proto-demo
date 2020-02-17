package dev.drf.grpc.demo;

import com.google.protobuf.RpcCallback;
import com.google.protobuf.RpcController;
import dev.drf.grpc.demo.dto.RequestOuterClass;
import dev.drf.grpc.demo.dto.ResponseOuterClass;

public class DemoServiceImpl extends DemoService {
    @Override
    public void send(RpcController controller,
                     RequestOuterClass.Request request,
                     RpcCallback<ResponseOuterClass.Response> done) {
        // TODO implementation
    }
}
