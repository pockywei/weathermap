package com.service.edge;

import org.apache.servicecomb.common.rest.filter.HttpServerFilter;
import org.apache.servicecomb.core.Invocation;
import org.apache.servicecomb.foundation.vertx.http.HttpServletRequestEx;
import org.apache.servicecomb.foundation.vertx.http.HttpServletResponseEx;
import org.apache.servicecomb.swagger.invocation.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DemoFilter implements HttpServerFilter {

    private static final Logger LOGGER = LoggerFactory.getLogger(DemoFilter.class);

    @Override
    public int getOrder() {
        return 1000;
    }

    @Override
    public Response afterReceiveRequest(Invocation invocation, HttpServletRequestEx requestEx) {
        LOGGER.info("Edge service has received a request.");
        return null;
    }

    @Override
    public void beforeSendResponse(Invocation invocation, HttpServletResponseEx responseEx) {
    }
}
