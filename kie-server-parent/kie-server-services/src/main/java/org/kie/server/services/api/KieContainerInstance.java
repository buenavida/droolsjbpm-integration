package org.kie.server.services.api;

import java.util.Set;

import org.kie.api.builder.KieScanner;
import org.kie.api.runtime.KieContainer;
import org.kie.server.api.marshalling.Marshaller;
import org.kie.server.api.marshalling.MarshallingFormat;
import org.kie.server.api.model.KieContainerResource;
import org.kie.server.api.model.KieContainerStatus;

public interface KieContainerInstance {

    String getContainerId();

    KieContainer getKieContainer();

    KieContainerStatus getStatus();

    KieContainerResource getResource();

    KieScanner getScanner();

    Marshaller getMarshaller(MarshallingFormat format);

    void disposeMarshallers();

    void addService(Object service);

    boolean addJaxbClasses(Set<Class<?>> extraJaxbClassList);

    void clearJaxbClasses();

    Set<Class<?>> getExtraJaxbClasses();

    <T> T getService(Class<T> serviceType);

    <T> T removeService(Class<T> serviceType);
}
