
package com.sun.grizzly.util;

import com.sun.grizzly.localization.Localizable;
import com.sun.grizzly.localization.LocalizableMessageFactory;
import com.sun.grizzly.localization.Localizer;


/**
 * Defines string formatting method for each constant in the resource file
 * 
 */
public final class LogMessages {

    private final static LocalizableMessageFactory messageFactory = new LocalizableMessageFactory("com.sun.grizzly.util.log");
    private final static Localizer localizer = new Localizer();

    public static Localizable localizableWARNING_GRIZZLY_HTTP_SELECTOR_THREAD_STATISTICS() {
        return messageFactory.getMessage("warning.grizzly.http.selector-thread.statistics");
    }

    /**
     * GRIZZLY0028: Statistics could be enabled.  Use StatsThreadPool to enable statistics.
     * 
     */
    public static String WARNING_GRIZZLY_HTTP_SELECTOR_THREAD_STATISTICS() {
        return localizer.localize(localizableWARNING_GRIZZLY_HTTP_SELECTOR_THREAD_STATISTICS());
    }

    public static Localizable localizableWARNING_GRIZZLY_UTILS_STATE_HOLDER_CONDITION_LISTENER_INVOCATION_ERROR() {
        return messageFactory.getMessage("warning.grizzly.utils.state.holder.condition-listener.invocation.error");
    }

    /**
     * GRIZZLY0071: Error calling ConditionListener.
     * 
     */
    public static String WARNING_GRIZZLY_UTILS_STATE_HOLDER_CONDITION_LISTENER_INVOCATION_ERROR() {
        return localizer.localize(localizableWARNING_GRIZZLY_UTILS_STATE_HOLDER_CONDITION_LISTENER_INVOCATION_ERROR());
    }

    public static Localizable localizableWARNING_GRIZZLY_PU_GENERAL_EXCEPTION() {
        return messageFactory.getMessage("warning.grizzly.pu.general.exception");
    }

    /**
     * GRIZZLY0059: PortUnification exception.
     * 
     */
    public static String WARNING_GRIZZLY_PU_GENERAL_EXCEPTION() {
        return localizer.localize(localizableWARNING_GRIZZLY_PU_GENERAL_EXCEPTION());
    }

    public static Localizable localizableSEVERE_GRIZZLY_HTTP_PROCESSOR_TASK_UNKNOWN_FILTER(Object arg0) {
        return messageFactory.getMessage("severe.grizzly.http.processor-task.unknown.filter", arg0);
    }

    /**
     * GRIZZLY0043: Unknown filter: {0}.
     * 
     */
    public static String SEVERE_GRIZZLY_HTTP_PROCESSOR_TASK_UNKNOWN_FILTER(Object arg0) {
        return localizer.localize(localizableSEVERE_GRIZZLY_HTTP_PROCESSOR_TASK_UNKNOWN_FILTER(arg0));
    }

    public static Localizable localizableSEVERE_GRIZZLY_WS_NOT_ENABLED() {
        return messageFactory.getMessage("severe.grizzly.ws.not.enabled");
    }

    /**
     * GRIZZLY0079: WebSockets are not enabled.  Please enable support before registering websockets-based applications.
     * 
     */
    public static String SEVERE_GRIZZLY_WS_NOT_ENABLED() {
        return localizer.localize(localizableSEVERE_GRIZZLY_WS_NOT_ENABLED());
    }

    public static Localizable localizableSEVERE_GRIZZLY_HTTP_SELECTOR_THREAD_HTTP_PROCESSING_ERROR() {
        return messageFactory.getMessage("severe.grizzly.http.selector-thread.http.processing.error");
    }

    /**
     * GRIZZLY0045: Exception during HTTP processing.
     * 
     */
    public static String SEVERE_GRIZZLY_HTTP_SELECTOR_THREAD_HTTP_PROCESSING_ERROR() {
        return localizer.localize(localizableSEVERE_GRIZZLY_HTTP_SELECTOR_THREAD_HTTP_PROCESSING_ERROR());
    }

    public static Localizable localizableSEVERE_GRIZZLY_UTILS_URI_INVALID_ENCODING(Object arg0) {
        return messageFactory.getMessage("severe.grizzly.utils.uri.invalid.encoding", arg0);
    }

    /**
     * GRIZZLY0073: Invalid URI encoding; {0}.
     * 
     */
    public static String SEVERE_GRIZZLY_UTILS_URI_INVALID_ENCODING(Object arg0) {
        return localizer.localize(localizableSEVERE_GRIZZLY_UTILS_URI_INVALID_ENCODING(arg0));
    }

    public static Localizable localizableWARNING_GRIZZLY_UTILS_SELECTOR_FACTORY_TEMPORARY_SELECTOR_RELEASE_ERROR() {
        return messageFactory.getMessage("warning.grizzly.utils.selector.factory.temporary.selector.release.error");
    }

    /**
     * GRIZZLY0068: Unexpected problem when releasing temporary Selector.
     * 
     */
    public static String WARNING_GRIZZLY_UTILS_SELECTOR_FACTORY_TEMPORARY_SELECTOR_RELEASE_ERROR() {
        return localizer.localize(localizableWARNING_GRIZZLY_UTILS_SELECTOR_FACTORY_TEMPORARY_SELECTOR_RELEASE_ERROR());
    }

    public static Localizable localizableWARNING_GRIZZLY_UTILS_SELECTOR_FACTORY_STATIC_INIT_ERROR() {
        return messageFactory.getMessage("warning.grizzly.utils.selector.factory.static.init.error");
    }

    /**
     * GRIZZLY0066: Static initialization of SelectorFactory failed.
     * 
     */
    public static String WARNING_GRIZZLY_UTILS_SELECTOR_FACTORY_STATIC_INIT_ERROR() {
        return localizer.localize(localizableWARNING_GRIZZLY_UTILS_SELECTOR_FACTORY_STATIC_INIT_ERROR());
    }

    public static Localizable localizableWARNING_GRIZZLY_CONNECTOR_HANDLER_REUSEADDRESS_EXCEPTION() {
        return messageFactory.getMessage("warning.grizzly.connector-handler.reuseaddress.exception");
    }

    /**
     * GRIZZLY0005: setReuseAddress exception
     * 
     */
    public static String WARNING_GRIZZLY_CONNECTOR_HANDLER_REUSEADDRESS_EXCEPTION() {
        return localizer.localize(localizableWARNING_GRIZZLY_CONNECTOR_HANDLER_REUSEADDRESS_EXCEPTION());
    }

    public static Localizable localizableWARNING_GRIZZLY_TCPSELECTOR_HANDLER_ACCEPTCHANNEL_EXCEPTION() {
        return messageFactory.getMessage("warning.grizzly.tcpselector-handler.acceptchannel.exception");
    }

    /**
     * GRIZZLY0006: Exception accepting channel
     * 
     */
    public static String WARNING_GRIZZLY_TCPSELECTOR_HANDLER_ACCEPTCHANNEL_EXCEPTION() {
        return localizer.localize(localizableWARNING_GRIZZLY_TCPSELECTOR_HANDLER_ACCEPTCHANNEL_EXCEPTION());
    }

    public static Localizable localizableWARNING_GRIZZLY_HTTP_PROCESSOR_TASK_REQUEST_DE_REGISTRATION_ERROR() {
        return messageFactory.getMessage("warning.grizzly.http.processor-task.request.de-registration.error");
    }

    /**
     * GRIZZLY0027: Error unregistering request.
     * 
     */
    public static String WARNING_GRIZZLY_HTTP_PROCESSOR_TASK_REQUEST_DE_REGISTRATION_ERROR() {
        return localizer.localize(localizableWARNING_GRIZZLY_HTTP_PROCESSOR_TASK_REQUEST_DE_REGISTRATION_ERROR());
    }

    public static Localizable localizableSEVERE_GRIZZLY_COMETD_ONEVENT_ERROR() {
        return messageFactory.getMessage("severe.grizzly.cometd.onevent.error");
    }

    /**
     * GRIZZLY61: Exception while processing onEvent.
     * 
     */
    public static String SEVERE_GRIZZLY_COMETD_ONEVENT_ERROR() {
        return localizer.localize(localizableSEVERE_GRIZZLY_COMETD_ONEVENT_ERROR());
    }

    public static Localizable localizableWARNING_GRIZZLY_HTTP_PROCESSOR_TASK_SSL_ERROR() {
        return messageFactory.getMessage("warning.grizzly.http.processor-task.ssl.error");
    }

    /**
     * GRIZZLY00: Exception getting SSL attributes.
     * 
     */
    public static String WARNING_GRIZZLY_HTTP_PROCESSOR_TASK_SSL_ERROR() {
        return localizer.localize(localizableWARNING_GRIZZLY_HTTP_PROCESSOR_TASK_SSL_ERROR());
    }

    public static Localizable localizableWARNING_GRIZZLY_PU_TLS_PROCESSOR_SKIPPED() {
        return messageFactory.getMessage("warning.grizzly.pu.tls-processor.skipped");
    }

    /**
     * GRIZZLY0060: Grizzly Port unification warning.  TLSPreProcessor will be skipped.  SSLContext in NULL!
     * 
     */
    public static String WARNING_GRIZZLY_PU_TLS_PROCESSOR_SKIPPED() {
        return localizer.localize(localizableWARNING_GRIZZLY_PU_TLS_PROCESSOR_SKIPPED());
    }

    public static Localizable localizableSEVERE_GRIZZLY_HTTP_PROCESSOR_TASK_REQUEST_HEADER_TOO_LARGE_ERROR() {
        return messageFactory.getMessage("severe.grizzly.http.processor-task.request.header.too-large.error");
    }

    /**
     * GRIZZLY0040: Request header is too large.
     * 
     */
    public static String SEVERE_GRIZZLY_HTTP_PROCESSOR_TASK_REQUEST_HEADER_TOO_LARGE_ERROR() {
        return localizer.localize(localizableSEVERE_GRIZZLY_HTTP_PROCESSOR_TASK_REQUEST_HEADER_TOO_LARGE_ERROR());
    }

    public static Localizable localizableSEVERE_GRIZZLY_HTTP_SELECTOR_THREAD_CONTROLLER_PROCESS_ERROR() {
        return messageFactory.getMessage("severe.grizzly.http.selector-thread.controller.process.error");
    }

    /**
     * GRIZZLY0048: Exception during controller processing.
     * 
     */
    public static String SEVERE_GRIZZLY_HTTP_SELECTOR_THREAD_CONTROLLER_PROCESS_ERROR() {
        return localizer.localize(localizableSEVERE_GRIZZLY_HTTP_SELECTOR_THREAD_CONTROLLER_PROCESS_ERROR());
    }

    public static Localizable localizableSEVERE_GRIZZLY_COMET_ENGINE_FLUSH_ERROR() {
        return messageFactory.getMessage("severe.grizzly.comet.engine.flush.error");
    }

    /**
     * GRIZZLY0016: Response resume failed during post-execute of comet task.
     * 
     */
    public static String SEVERE_GRIZZLY_COMET_ENGINE_FLUSH_ERROR() {
        return localizer.localize(localizableSEVERE_GRIZZLY_COMET_ENGINE_FLUSH_ERROR());
    }

    public static Localizable localizableWARNING_GRIZZLY_HTTP_PROCESSOR_TASK_SSL_CERT_ERROR() {
        return messageFactory.getMessage("warning.grizzly.http.processor-task.ssl.cert.error");
    }

    /**
     * GRIZZLY0025: Exception getting SSL certificate.
     * 
     */
    public static String WARNING_GRIZZLY_HTTP_PROCESSOR_TASK_SSL_CERT_ERROR() {
        return localizer.localize(localizableWARNING_GRIZZLY_HTTP_PROCESSOR_TASK_SSL_CERT_ERROR());
    }

    public static Localizable localizableWARNING_GRIZZLY_COMET_ENGINE_FLUSH_INVALID_STAGE_ERROR() {
        return messageFactory.getMessage("warning.grizzly.comet.engine.flush.invalid.stage.error");
    }

    /**
     * GRIZZLY0013: Post execution of CometTask invoke during the wrong stage.
     * 
     */
    public static String WARNING_GRIZZLY_COMET_ENGINE_FLUSH_INVALID_STAGE_ERROR() {
        return localizer.localize(localizableWARNING_GRIZZLY_COMET_ENGINE_FLUSH_INVALID_STAGE_ERROR());
    }

    public static Localizable localizableWARNING_GRIZZLY_UTILS_SELECTOR_FACTORY_NO_SELECTORS_AVAILABLE_ERROR(Object arg0) {
        return messageFactory.getMessage("warning.grizzly.utils.selector.factory.no.selectors.available.error", arg0);
    }

    /**
     * GRIZZLY0067: No Selectors available. Increase the configuration value from {0}.
     * 
     */
    public static String WARNING_GRIZZLY_UTILS_SELECTOR_FACTORY_NO_SELECTORS_AVAILABLE_ERROR(Object arg0) {
        return localizer.localize(localizableWARNING_GRIZZLY_UTILS_SELECTOR_FACTORY_NO_SELECTORS_AVAILABLE_ERROR(arg0));
    }

    public static Localizable localizableSEVERE_GRIZZLY_HTTP_SELECTOR_THREAD_START() {
        return messageFactory.getMessage("severe.grizzly.http.selector-thread.start");
    }

    /**
     * GRIZZLY0046: Exception starting end point.
     * 
     */
    public static String SEVERE_GRIZZLY_HTTP_SELECTOR_THREAD_START() {
        return localizer.localize(localizableSEVERE_GRIZZLY_HTTP_SELECTOR_THREAD_START());
    }

    public static Localizable localizableWARNING_GRIZZLY_HTTP_PROCESSOR_TASK_REQUEST_REGISTRATION_ERROR() {
        return messageFactory.getMessage("warning.grizzly.http.processor-task.request.registration.error");
    }

    /**
     * GRIZZLY0026: Error registering request.
     * 
     */
    public static String WARNING_GRIZZLY_HTTP_PROCESSOR_TASK_REQUEST_REGISTRATION_ERROR() {
        return localizer.localize(localizableWARNING_GRIZZLY_HTTP_PROCESSOR_TASK_REQUEST_REGISTRATION_ERROR());
    }

    public static Localizable localizableINFO_GRIZZLY_HTTP_PROCESSOR_TASK_SOCKET_CHANNEL_REQUEST_LINE(Object arg0, Object arg1) {
        return messageFactory.getMessage("info.grizzly.http.processor-task.socket-channel.request.line", arg0, arg1);
    }

    /**
     * GRIZZLY0019: SocketChannel request line {0} is: {1}.
     * 
     */
    public static String INFO_GRIZZLY_HTTP_PROCESSOR_TASK_SOCKET_CHANNEL_REQUEST_LINE(Object arg0, Object arg1) {
        return localizer.localize(localizableINFO_GRIZZLY_HTTP_PROCESSOR_TASK_SOCKET_CHANNEL_REQUEST_LINE(arg0, arg1));
    }

    public static Localizable localizableWARNING_GRIZZLY_COMET_SELECTOR_CACHE_RESIZE_ERROR() {
        return messageFactory.getMessage("warning.grizzly.comet.selector.cache.resize.error");
    }

    /**
     * GRIZZLY0012: Unable to re-size selector cache.
     * 
     */
    public static String WARNING_GRIZZLY_COMET_SELECTOR_CACHE_RESIZE_ERROR() {
        return localizer.localize(localizableWARNING_GRIZZLY_COMET_SELECTOR_CACHE_RESIZE_ERROR());
    }

    public static Localizable localizableWARNING_GRIZZLY_HTTP_SERVLET_SESSION_LISTENER_BOUND_ERROR(Object arg0) {
        return messageFactory.getMessage("warning.grizzly.http.servlet.session.listener.bound.error", arg0);
    }

    /**
     * GRIZZLY0057: Exception invoking valueBound() on HttpSessionBindingListener {0}.
     * 
     */
    public static String WARNING_GRIZZLY_HTTP_SERVLET_SESSION_LISTENER_BOUND_ERROR(Object arg0) {
        return localizer.localize(localizableWARNING_GRIZZLY_HTTP_SERVLET_SESSION_LISTENER_BOUND_ERROR(arg0));
    }

    public static Localizable localizableWARNING_GRIZZLY_HTTP_SELECTOR_THREAD_MBEAN_DEREGISTRATION_ERROR(Object arg0) {
        return messageFactory.getMessage("warning.grizzly.http.selector-thread.mbean.deregistration.error", arg0);
    }

    /**
     * GRIZZLY0032: Exception when de-registering http-listener [{0}] mbeans.
     * 
     */
    public static String WARNING_GRIZZLY_HTTP_SELECTOR_THREAD_MBEAN_DEREGISTRATION_ERROR(Object arg0) {
        return localizer.localize(localizableWARNING_GRIZZLY_HTTP_SELECTOR_THREAD_MBEAN_DEREGISTRATION_ERROR(arg0));
    }

    public static Localizable localizableSEVERE_GRIZZLY_HTTP_SELECTOR_THREAD_CONTROLLER_START_ERROR() {
        return messageFactory.getMessage("severe.grizzly.http.selector-thread.controller.start.error");
    }

    /**
     * GRIZZLY0047: Exception starting the controller.
     * 
     */
    public static String SEVERE_GRIZZLY_HTTP_SELECTOR_THREAD_CONTROLLER_START_ERROR() {
        return localizer.localize(localizableSEVERE_GRIZZLY_HTTP_SELECTOR_THREAD_CONTROLLER_START_ERROR());
    }

    public static Localizable localizableINFO_GRIZZLY_CONFIGURATION(Object arg0, Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6, Object arg7, Object arg8, Object arg9, Object arg10, Object arg11, Object arg12, Object arg13) {
        return messageFactory.getMessage("info.grizzly.configuration", arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13);
    }

    /**
     * GRIZZLY0002: 
     *  Grizzly running on {0}-{1} under JDK version: {2}-{3}
     * 	 Thread Pool: {4}
     * 	 Read Selector: {5}
     * 	 auto-configure: {6}
     * 	 Using Leader/follower strategy: {7}
     * 	 Number of SelectorHandler: {8}
     * 	 SelectionKeyHandler: {9}
     * 	 Context Caching: {10}
     * 	 Maximum Accept Retry: {11}
     * 	 Handler Read/Write I/O Concurrently {12}
     * 	 ProtocolChainHandler: {13}
     * 
     */
    public static String INFO_GRIZZLY_CONFIGURATION(Object arg0, Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6, Object arg7, Object arg8, Object arg9, Object arg10, Object arg11, Object arg12, Object arg13) {
        return localizer.localize(localizableINFO_GRIZZLY_CONFIGURATION(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13));
    }

    public static Localizable localizableINFO_GRIZZLY_HTTP_PROCESSOR_TASK_NO_KEEPALIVE_ALGORITHM() {
        return messageFactory.getMessage("info.grizzly.http.processor-task.no.keepalive.algorithm");
    }

    /**
     * GRIZZLY0017: No keep alive algorithm will not be used.
     * 
     */
    public static String INFO_GRIZZLY_HTTP_PROCESSOR_TASK_NO_KEEPALIVE_ALGORITHM() {
        return localizer.localize(localizableINFO_GRIZZLY_HTTP_PROCESSOR_TASK_NO_KEEPALIVE_ALGORITHM());
    }

    public static Localizable localizableWARNING_GRIZZLY_HTTP_SELECTOR_THREAD_STOP() {
        return messageFactory.getMessage("warning.grizzly.http.selector-thread.stop");
    }

    /**
     * GRIZZLY0029: Exception stopping end point.
     * 
     */
    public static String WARNING_GRIZZLY_HTTP_SELECTOR_THREAD_STOP() {
        return localizer.localize(localizableWARNING_GRIZZLY_HTTP_SELECTOR_THREAD_STOP());
    }

    public static Localizable localizableSEVERE_GRIZZLY_HTTP_PROCESSOR_TASK_REQUEST_FINISH_ERROR() {
        return messageFactory.getMessage("severe.grizzly.http.processor-task.request.finish.error");
    }

    /**
     * GRIZZLY0036: Error finishing request.
     * 
     */
    public static String SEVERE_GRIZZLY_HTTP_PROCESSOR_TASK_REQUEST_FINISH_ERROR() {
        return localizer.localize(localizableSEVERE_GRIZZLY_HTTP_PROCESSOR_TASK_REQUEST_FINISH_ERROR());
    }

    public static Localizable localizableWARNING_GRIZZLY_HTTP_SERVLET_CONTAINER_OBJECT_DESTROYED_ERROR(Object arg0, Object arg1, Object arg2) {
        return messageFactory.getMessage("warning.grizzly.http.servlet.container.object.destroyed.error", arg0, arg1, arg2);
    }

    /**
     * GRIZZLY0053: Exception invoking {0}() on {1}: {2}.
     * 
     */
    public static String WARNING_GRIZZLY_HTTP_SERVLET_CONTAINER_OBJECT_DESTROYED_ERROR(Object arg0, Object arg1, Object arg2) {
        return localizer.localize(localizableWARNING_GRIZZLY_HTTP_SERVLET_CONTAINER_OBJECT_DESTROYED_ERROR(arg0, arg1, arg2));
    }

    public static Localizable localizableWARNING_GRIZZLY_HTTP_PROCESSOR_TASK_TERMINATE_PROCESSES_INTERRUPT() {
        return messageFactory.getMessage("warning.grizzly.http.processor-task.terminate.processes.interrupt");
    }

    /**
     * GRIZZLY0024: Terminate process interrupted.
     * 
     */
    public static String WARNING_GRIZZLY_HTTP_PROCESSOR_TASK_TERMINATE_PROCESSES_INTERRUPT() {
        return localizer.localize(localizableWARNING_GRIZZLY_HTTP_PROCESSOR_TASK_TERMINATE_PROCESSES_INTERRUPT());
    }

    public static Localizable localizableWARNING_GRIZZLY_HTTP_SERVLET_CONTAINER_OBJECT_INITIALIZED_ERROR(Object arg0, Object arg1, Object arg2) {
        return messageFactory.getMessage("warning.grizzly.http.servlet.container.object.initialized.error", arg0, arg1, arg2);
    }

    /**
     * GRIZZLY0052: Exception invoking {0}() on {1}: {2}.
     * 
     */
    public static String WARNING_GRIZZLY_HTTP_SERVLET_CONTAINER_OBJECT_INITIALIZED_ERROR(Object arg0, Object arg1, Object arg2) {
        return localizer.localize(localizableWARNING_GRIZZLY_HTTP_SERVLET_CONTAINER_OBJECT_INITIALIZED_ERROR(arg0, arg1, arg2));
    }

    public static Localizable localizableWARNING_GRIZZLY_HTTP_SERVLET_CONTEXT_LISTENER_LOAD_ERROR(Object arg0) {
        return messageFactory.getMessage("warning.grizzly.http.servlet.context.listener.load.error", arg0);
    }

    /**
     * GRIZZLY0058: Unable to load listener: {0}.
     * 
     */
    public static String WARNING_GRIZZLY_HTTP_SERVLET_CONTEXT_LISTENER_LOAD_ERROR(Object arg0) {
        return localizer.localize(localizableWARNING_GRIZZLY_HTTP_SERVLET_CONTEXT_LISTENER_LOAD_ERROR(arg0));
    }

    public static Localizable localizableSEVERE_GRIZZLY_HTTP_SELECTOR_THREAD_INVALID_THREAD_FACTORY_ERROR(Object arg0) {
        return messageFactory.getMessage("severe.grizzly.http.selector-thread.invalid.thread-factory.error", arg0);
    }

    /**
     * GRIZZLY0049: Invalid ThreadFactory.  Configured ThreadFactory must return instance of {0}.
     * 
     */
    public static String SEVERE_GRIZZLY_HTTP_SELECTOR_THREAD_INVALID_THREAD_FACTORY_ERROR(Object arg0) {
        return localizer.localize(localizableSEVERE_GRIZZLY_HTTP_SELECTOR_THREAD_INVALID_THREAD_FACTORY_ERROR(arg0));
    }

    public static Localizable localizableSEVERE_GRIZZLY_HTTP_PROCESSOR_TASK_RESPONSE_FINISH_ERROR() {
        return messageFactory.getMessage("severe.grizzly.http.processor-task.response.finish.error");
    }

    /**
     * GRIZZLY0037: Error finishing response.
     * 
     */
    public static String SEVERE_GRIZZLY_HTTP_PROCESSOR_TASK_RESPONSE_FINISH_ERROR() {
        return localizer.localize(localizableSEVERE_GRIZZLY_HTTP_PROCESSOR_TASK_RESPONSE_FINISH_ERROR());
    }

    public static Localizable localizableWARNING_GRIZZLY_WS_MULTIPLE_APPS() {
        return messageFactory.getMessage("warning.grizzly.ws.multiple.apps");
    }

    /**
     * GRIZZLY0080: Multiple applications are registered for this request.  Set the property grizzly.websockets.constrainApplications to false to disable this message.
     * 
     */
    public static String WARNING_GRIZZLY_WS_MULTIPLE_APPS() {
        return localizer.localize(localizableWARNING_GRIZZLY_WS_MULTIPLE_APPS());
    }

    public static Localizable localizableWARNING_GRIZZLY_UTILS_SELECTOR_FACTORY_SELECTOR_REMOVE_ERROR() {
        return messageFactory.getMessage("warning.grizzly.utils.selector.factory.selector.remove.error");
    }

    /**
     * GRIZZLY0070: SelectorFactory cache could not remove the desired number, too few selectors in cache.
     * 
     */
    public static String WARNING_GRIZZLY_UTILS_SELECTOR_FACTORY_SELECTOR_REMOVE_ERROR() {
        return localizer.localize(localizableWARNING_GRIZZLY_UTILS_SELECTOR_FACTORY_SELECTOR_REMOVE_ERROR());
    }

    public static Localizable localizableWARNING_GRIZZLY_UTILS_SELECTOR_FACTORY_SELECTOR_REIMBURSEMENT_ERROR() {
        return messageFactory.getMessage("warning.grizzly.utils.selector.factory.selector.reimbursement.error");
    }

    /**
     * GRIZZLY0069: Problematic Selector could not be reimbursed!
     * 
     */
    public static String WARNING_GRIZZLY_UTILS_SELECTOR_FACTORY_SELECTOR_REIMBURSEMENT_ERROR() {
        return localizer.localize(localizableWARNING_GRIZZLY_UTILS_SELECTOR_FACTORY_SELECTOR_REIMBURSEMENT_ERROR());
    }

    public static Localizable localizableWARNING_GRIZZLY_HTTP_SELECTOR_THREAD_SOCKET_OPTION_ERROR(Object arg0) {
        return messageFactory.getMessage("warning.grizzly.http.selector-thread.socket.option.error", arg0);
    }

    /**
     * GRIZZLY0030: {0} exception.
     * 
     */
    public static String WARNING_GRIZZLY_HTTP_SELECTOR_THREAD_SOCKET_OPTION_ERROR(Object arg0) {
        return localizer.localize(localizableWARNING_GRIZZLY_HTTP_SELECTOR_THREAD_SOCKET_OPTION_ERROR(arg0));
    }

    public static Localizable localizableWARNING_GRIZZLY_HTTP_SELECTOR_THREAD_UNKNOWN_THREAD_FACTORY_ERROR(Object arg0) {
        return messageFactory.getMessage("warning.grizzly.http.selector-thread.unknown.thread-factory.error", arg0);
    }

    /**
     * GRIZZLY0035: Cannot guess which ThreadFactory the ExecutorService is using.  A ClassCastException might be thrown if the ThreadFactory is not creating an instance of {0}.
     * 
     */
    public static String WARNING_GRIZZLY_HTTP_SELECTOR_THREAD_UNKNOWN_THREAD_FACTORY_ERROR(Object arg0) {
        return localizer.localize(localizableWARNING_GRIZZLY_HTTP_SELECTOR_THREAD_UNKNOWN_THREAD_FACTORY_ERROR(arg0));
    }

    public static Localizable localizableSEVERE_GRIZZLY_HTTP_DPF_PROCESSOR_TASK_ERROR() {
        return messageFactory.getMessage("severe.grizzly.http.dpf.processor-task.error");
    }

    /**
     * GRIZZLY0051: ProcessorTask exception.
     * 
     */
    public static String SEVERE_GRIZZLY_HTTP_DPF_PROCESSOR_TASK_ERROR() {
        return localizer.localize(localizableSEVERE_GRIZZLY_HTTP_DPF_PROCESSOR_TASK_ERROR());
    }

    public static Localizable localizableSEVERE_GRIZZLY_UTILS_MAPPER_NO_CONTEXT_FOUND(Object arg0) {
        return messageFactory.getMessage("severe.grizzly.utils.mapper.no-context-found", arg0);
    }

    /**
     * GRIZZLY0074: No context found: {0}.
     * 
     */
    public static String SEVERE_GRIZZLY_UTILS_MAPPER_NO_CONTEXT_FOUND(Object arg0) {
        return localizer.localize(localizableSEVERE_GRIZZLY_UTILS_MAPPER_NO_CONTEXT_FOUND(arg0));
    }

    public static Localizable localizableSEVERE_GRIZZLY_UTILS_SSL_JSSE_INSECURE_RENEGOTIATION_NOT_ALLOWED() {
        return messageFactory.getMessage("severe.grizzly.utils.ssl.jsse.insecure_renegotiation_not_allowed");
    }

    /**
     * GRIZZLY0081: Secure SSL/TLS renegotiation is not supported by the peer.  This is most likely due to the peer using an older SSL/TLS implementation that does not implement RFC 5746.
     * 
     */
    public static String SEVERE_GRIZZLY_UTILS_SSL_JSSE_INSECURE_RENEGOTIATION_NOT_ALLOWED() {
        return localizer.localize(localizableSEVERE_GRIZZLY_UTILS_SSL_JSSE_INSECURE_RENEGOTIATION_NOT_ALLOWED());
    }

    public static Localizable localizableWARNING_GRIZZLY_UTILS_INSTROSPECTION_IAE(Object arg0, Object arg1, Object arg2) {
        return messageFactory.getMessage("warning.grizzly.utils.instrospection.iae", arg0, arg1, arg2);
    }

    /**
     * GRIZZLY0064: IllegalArgumentException {0} {1} {2}.
     * 
     */
    public static String WARNING_GRIZZLY_UTILS_INSTROSPECTION_IAE(Object arg0, Object arg1, Object arg2) {
        return localizer.localize(localizableWARNING_GRIZZLY_UTILS_INSTROSPECTION_IAE(arg0, arg1, arg2));
    }

    public static Localizable localizableSEVERE_GRIZZLY_HTTP_PROCESSOR_TASK_SERVICE_ERROR() {
        return messageFactory.getMessage("severe.grizzly.http.processor-task.service.error");
    }

    /**
     * GRIZZLY0038: HTTP Processing error.
     * 
     */
    public static String SEVERE_GRIZZLY_HTTP_PROCESSOR_TASK_SERVICE_ERROR() {
        return localizer.localize(localizableSEVERE_GRIZZLY_HTTP_PROCESSOR_TASK_SERVICE_ERROR());
    }

    public static Localizable localizableINFO_GRIZZLY_HTTP_SELECTOR_THREAD_CONFIG(Object arg0, Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6, Object arg7, Object arg8, Object arg9, Object arg10, Object arg11, Object arg12, Object arg13, Object arg14, Object arg15) {
        return messageFactory.getMessage("info.grizzly.http.selector-thread.config", arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15);
    }

    /**
     * GRIZZLY0021: "
     *  Grizzly running on {0} - {1} under JDK version: {2} - {3} 
     * 	 port: {4}
     * 	 Thread Pool: {5}
     * 	 Read Selector: {6}
     * 	 ByteBuffer size: {7} 
     * 	 maxHttpHeaderSize: {8}
     * 	 sendBufferSize: {9}
     * 	 maxKeepAliveRequests: {10}
     * 	 keepAliveTimeoutInSeconds: {11} 
     * 	 Static File Cache enabled: {12}
     * 	 Static resources directory: {13}
     * 	 Adapter : {14} 
     * 	 Asynchronous Request Processing enabled: {15}
     * 
     */
    public static String INFO_GRIZZLY_HTTP_SELECTOR_THREAD_CONFIG(Object arg0, Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6, Object arg7, Object arg8, Object arg9, Object arg10, Object arg11, Object arg12, Object arg13, Object arg14, Object arg15) {
        return localizer.localize(localizableINFO_GRIZZLY_HTTP_SELECTOR_THREAD_CONFIG(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15));
    }

    public static Localizable localizableINFO_GRIZZLY_HTTP_PROCESSOR_TASK_NO_BLOCKING_KEEPALIVE_ALGORITHM() {
        return messageFactory.getMessage("info.grizzly.http.processor-task.no.blocking.keepalive.algorithm");
    }

    /**
     * GRIZZLY0018: Keep Alive blocking thread algorithm will not be used.
     * 
     */
    public static String INFO_GRIZZLY_HTTP_PROCESSOR_TASK_NO_BLOCKING_KEEPALIVE_ALGORITHM() {
        return localizer.localize(localizableINFO_GRIZZLY_HTTP_PROCESSOR_TASK_NO_BLOCKING_KEEPALIVE_ALGORITHM());
    }

    public static Localizable localizableSEVERE_GRIZZLY_HTTP_PROCESSOR_TASK_NON_BLOCKING_ERROR() {
        return messageFactory.getMessage("severe.grizzly.http.processor-task.non-blocking.error");
    }

    /**
     * GRIZZLY0041: Unblocking keep-alive exception.
     * 
     */
    public static String SEVERE_GRIZZLY_HTTP_PROCESSOR_TASK_NON_BLOCKING_ERROR() {
        return localizer.localize(localizableSEVERE_GRIZZLY_HTTP_PROCESSOR_TASK_NON_BLOCKING_ERROR());
    }

    public static Localizable localizableWARNING_GRIZZLY_HTTP_SERVLET_SESSION_LISTENER_UNBOUND_ERROR(Object arg0) {
        return messageFactory.getMessage("warning.grizzly.http.servlet.session.listener.unbound.error", arg0);
    }

    /**
     * GRIZZLY0056: Exception invoking valueUnbound() on HttpSessionBindingListener {0}.
     * 
     */
    public static String WARNING_GRIZZLY_HTTP_SERVLET_SESSION_LISTENER_UNBOUND_ERROR(Object arg0) {
        return localizer.localize(localizableWARNING_GRIZZLY_HTTP_SERVLET_SESSION_LISTENER_UNBOUND_ERROR(arg0));
    }

    public static Localizable localizableWARNING_GRIZZLY_HTTP_SELECTOR_THREAD_MBEAN_REGISTRATION_ERROR(Object arg0) {
        return messageFactory.getMessage("warning.grizzly.http.selector-thread.mbean.registration.error", arg0);
    }

    /**
     * GRIZZLY0031: Exception when registering http-listener [{0}] mbeans.
     * 
     */
    public static String WARNING_GRIZZLY_HTTP_SELECTOR_THREAD_MBEAN_REGISTRATION_ERROR(Object arg0) {
        return localizer.localize(localizableWARNING_GRIZZLY_HTTP_SELECTOR_THREAD_MBEAN_REGISTRATION_ERROR(arg0));
    }

    public static Localizable localizableSEVERE_GRIZZLY_HTTP_PROCESSOR_TASK_FILTER_INIT_ERROR(Object arg0) {
        return messageFactory.getMessage("severe.grizzly.http.processor-task.filter.init.error", arg0);
    }

    /**
     * GRIZZLY0044: Error initializing filter [{0}]
     * 
     */
    public static String SEVERE_GRIZZLY_HTTP_PROCESSOR_TASK_FILTER_INIT_ERROR(Object arg0) {
        return localizer.localize(localizableSEVERE_GRIZZLY_HTTP_PROCESSOR_TASK_FILTER_INIT_ERROR(arg0));
    }

    public static Localizable localizableWARNING_GRIZZLY_UTILS_SELECTOR_FACTORY_SELECTOR_REMOVAL_ERROR(Object arg0, Object arg1) {
        return messageFactory.getMessage("warning.grizzly.utils.selector.factory.selector.removal.error", arg0, arg1);
    }

    /**
     * GRIZZLY0065: Attempt made to remove too many selectors: {0} >= {1}.
     * 
     */
    public static String WARNING_GRIZZLY_UTILS_SELECTOR_FACTORY_SELECTOR_REMOVAL_ERROR(Object arg0, Object arg1) {
        return localizer.localize(localizableWARNING_GRIZZLY_UTILS_SELECTOR_FACTORY_SELECTOR_REMOVAL_ERROR(arg0, arg1));
    }

    public static Localizable localizableWARNING_GRIZZLY_UTILS_ABSTRACT_THREAD_POOL_UNCAUGHT_EXCEPTION(Object arg0) {
        return messageFactory.getMessage("warning.grizzly.utils.abstract-thread-pool.uncaught-exception", arg0);
    }

    /**
     * GRIZZLY0063: Uncaught thread exception. Thread: {0}.
     * 
     */
    public static String WARNING_GRIZZLY_UTILS_ABSTRACT_THREAD_POOL_UNCAUGHT_EXCEPTION(Object arg0) {
        return localizer.localize(localizableWARNING_GRIZZLY_UTILS_ABSTRACT_THREAD_POOL_UNCAUGHT_EXCEPTION(arg0));
    }

    public static Localizable localizableWARNING_GRIZZLY_CONFIG_SSL_SSL_IMPLEMENTATION_LOAD_ERROR(Object arg0) {
        return messageFactory.getMessage("warning.grizzly.config.ssl.ssl-implementation.load.error", arg0);
    }

    /**
     * GRIZZLY0009: Unable to load SSLImplementation: {0}.
     * 
     */
    public static String WARNING_GRIZZLY_CONFIG_SSL_SSL_IMPLEMENTATION_LOAD_ERROR(Object arg0) {
        return localizer.localize(localizableWARNING_GRIZZLY_CONFIG_SSL_SSL_IMPLEMENTATION_LOAD_ERROR(arg0));
    }

    public static Localizable localizableWARNING_GRIZZLY_HTTP_SERVLET_ATTRIBUTE_LISTENER_ADD_ERROR(Object arg0, Object arg1) {
        return messageFactory.getMessage("warning.grizzly.http.servlet.attribute.listener.add.error", arg0, arg1);
    }

    /**
     * GRIZZLY0054: Exception invoking attributeAdded() or attributeReplaced() on {0}: {1}.
     * 
     */
    public static String WARNING_GRIZZLY_HTTP_SERVLET_ATTRIBUTE_LISTENER_ADD_ERROR(Object arg0, Object arg1) {
        return localizer.localize(localizableWARNING_GRIZZLY_HTTP_SERVLET_ATTRIBUTE_LISTENER_ADD_ERROR(arg0, arg1));
    }

    public static Localizable localizableINFO_GRIZZLY_START(Object arg0, Object arg1) {
        return messageFactory.getMessage("info.grizzly.start", arg0, arg1);
    }

    /**
     * GRIZZLY0001: Starting Grizzly Framework {0} - {1}
     * 
     */
    public static String INFO_GRIZZLY_START(Object arg0, Object arg1) {
        return localizer.localize(localizableINFO_GRIZZLY_START(arg0, arg1));
    }

    public static Localizable localizableSEVERE_GRIZZLY_CONFIG_SSL_CLASS_LOAD_FAILED_ERROR(Object arg0) {
        return messageFactory.getMessage("severe.grizzly.config.ssl.class.load.failed.error", arg0);
    }

    /**
     * GRIZZLY0011: Unable to load class: {0}.
     * 
     */
    public static String SEVERE_GRIZZLY_CONFIG_SSL_CLASS_LOAD_FAILED_ERROR(Object arg0) {
        return localizer.localize(localizableSEVERE_GRIZZLY_CONFIG_SSL_CLASS_LOAD_FAILED_ERROR(arg0));
    }

    public static Localizable localizableWARNING_GRIZZLY_HTTP_SCOB_FLUSH_UPSTREAM_ERROR() {
        return messageFactory.getMessage("warning.grizzly.http.scob.flush.upstream.error");
    }

    /**
     * GRIZZLY0034: Exception discarding upstream bytes.
     * 
     */
    public static String WARNING_GRIZZLY_HTTP_SCOB_FLUSH_UPSTREAM_ERROR() {
        return localizer.localize(localizableWARNING_GRIZZLY_HTTP_SCOB_FLUSH_UPSTREAM_ERROR());
    }

    public static Localizable localizableWARNING_GRIZZLY_CONFIG_SSL_UNKNOWN_CIPHER_ERROR(Object arg0) {
        return messageFactory.getMessage("warning.grizzly.config.ssl.unknown.cipher.error", arg0);
    }

    /**
     * GRIZZLY0010: Unrecognized cipher [{0}].
     * 
     */
    public static String WARNING_GRIZZLY_CONFIG_SSL_UNKNOWN_CIPHER_ERROR(Object arg0) {
        return localizer.localize(localizableWARNING_GRIZZLY_CONFIG_SSL_UNKNOWN_CIPHER_ERROR(arg0));
    }

    public static Localizable localizableSEVERE_GRIZZLY_COMET_IO_ERROR(Object arg0) {
        return messageFactory.getMessage("severe.grizzly.comet.io.error", arg0);
    }

    /**
     * GRIZZLY0014: I/O error occurred during invocation of {0}.
     * 
     */
    public static String SEVERE_GRIZZLY_COMET_IO_ERROR(Object arg0) {
        return localizer.localize(localizableSEVERE_GRIZZLY_COMET_IO_ERROR(arg0));
    }

    public static Localizable localizableINFO_GRIZZLY_HTTP_PROCESSOR_TASK_SOCKET_CHANNEL_REQUEST_HEADERS(Object arg0, Object arg1) {
        return messageFactory.getMessage("info.grizzly.http.processor-task.socket-channel.request.headers", arg0, arg1);
    }

    /**
     * GRIZZLY0020: SocketChannel headers {0} are: 
     * {1}.
     * 
     */
    public static String INFO_GRIZZLY_HTTP_PROCESSOR_TASK_SOCKET_CHANNEL_REQUEST_HEADERS(Object arg0, Object arg1) {
        return localizer.localize(localizableINFO_GRIZZLY_HTTP_PROCESSOR_TASK_SOCKET_CHANNEL_REQUEST_HEADERS(arg0, arg1));
    }

    public static Localizable localizableWARNING_GRIZZLY_WS_SELECT_ERROR(Object arg0) {
        return messageFactory.getMessage("warning.grizzly.ws.select.error", arg0);
    }

    /**
     * GRIZZLY62: Exception processing select(): {0}.
     * 
     */
    public static String WARNING_GRIZZLY_WS_SELECT_ERROR(Object arg0) {
        return localizer.localize(localizableWARNING_GRIZZLY_WS_SELECT_ERROR(arg0));
    }

    public static Localizable localizableWARNING_GRIZZLY_HTTP_SCOB_FLUSH_CHANNEL_ERROR() {
        return messageFactory.getMessage("warning.grizzly.http.scob.flush.channel.error");
    }

    /**
     * GRIZZLY0033: Async write is enabled, but AsyncWriter is null.
     * 
     */
    public static String WARNING_GRIZZLY_HTTP_SCOB_FLUSH_CHANNEL_ERROR() {
        return localizer.localize(localizableWARNING_GRIZZLY_HTTP_SCOB_FLUSH_CHANNEL_ERROR());
    }

    public static Localizable localizableSEVERE_GRIZZLY_UTILS_SSL_CERT_TRANSLATION_FAILED(Object arg0) {
        return messageFactory.getMessage("severe.grizzly.utils.ssl.cert.translation.failed", arg0);
    }

    /**
     * GRIZZLY0075: Error translating cert {0}.
     * 
     */
    public static String SEVERE_GRIZZLY_UTILS_SSL_CERT_TRANSLATION_FAILED(Object arg0) {
        return localizer.localize(localizableSEVERE_GRIZZLY_UTILS_SSL_CERT_TRANSLATION_FAILED(arg0));
    }

    public static Localizable localizableSEVERE_GRIZZLY_UTILS_LOAD_CLASS_ERROR(Object arg0) {
        return messageFactory.getMessage("severe.grizzly.utils.load.class.error", arg0);
    }

    /**
     * GRIZZLY0072: Unable to load class {0}.
     * 
     */
    public static String SEVERE_GRIZZLY_UTILS_LOAD_CLASS_ERROR(Object arg0) {
        return localizer.localize(localizableSEVERE_GRIZZLY_UTILS_LOAD_CLASS_ERROR(arg0));
    }

    public static Localizable localizableWARNING_GRIZZLY_CONFIG_SSL_SECURE_PASSWORD_INITIALIZATION_ERROR(Object arg0) {
        return messageFactory.getMessage("warning.grizzly.config.ssl.secure.password.initialization.error", arg0);
    }

    /**
     * GRIZZLY0008: Secure password provider could not be initialized: {0}.
     * 
     */
    public static String WARNING_GRIZZLY_CONFIG_SSL_SECURE_PASSWORD_INITIALIZATION_ERROR(Object arg0) {
        return localizer.localize(localizableWARNING_GRIZZLY_CONFIG_SSL_SECURE_PASSWORD_INITIALIZATION_ERROR(arg0));
    }

    public static Localizable localizableSEVERE_GRIZZLY_UTILS_SSL_JSSE_ALIAS_NO_KEY_ENTRY(Object arg0) {
        return messageFactory.getMessage("severe.grizzly.utils.ssl.jsse.alias_no_key_entry", arg0);
    }

    /**
     * GRIZZLY0076: Alias name {0} does not identify a key entry.
     * 
     */
    public static String SEVERE_GRIZZLY_UTILS_SSL_JSSE_ALIAS_NO_KEY_ENTRY(Object arg0) {
        return localizer.localize(localizableSEVERE_GRIZZLY_UTILS_SSL_JSSE_ALIAS_NO_KEY_ENTRY(arg0));
    }

    public static Localizable localizableWARNING_GRIZZLY_CONNECTOR_HANDLER_LINGER_EXCEPTION() {
        return messageFactory.getMessage("warning.grizzly.connector-handler.linger.exception");
    }

    /**
     * GRIZZLY0003: setSoLinger exception
     * 
     */
    public static String WARNING_GRIZZLY_CONNECTOR_HANDLER_LINGER_EXCEPTION() {
        return localizer.localize(localizableWARNING_GRIZZLY_CONNECTOR_HANDLER_LINGER_EXCEPTION());
    }

    public static Localizable localizableSEVERE_GRIZZLY_UTILS_SSL_JSSE_KEYSTORE_LOAD_FAILED(Object arg0, Object arg1, Object arg2) {
        return messageFactory.getMessage("severe.grizzly.utils.ssl.jsse.keystore_load_failed", arg0, arg1, arg2);
    }

    /**
     * GRIZZLY0077: Failed to load keystore type {0} with path {1} due to {2}.
     * 
     */
    public static String SEVERE_GRIZZLY_UTILS_SSL_JSSE_KEYSTORE_LOAD_FAILED(Object arg0, Object arg1, Object arg2) {
        return localizer.localize(localizableSEVERE_GRIZZLY_UTILS_SSL_JSSE_KEYSTORE_LOAD_FAILED(arg0, arg1, arg2));
    }

    public static Localizable localizableWARNING_GRIZZLY_HTTP_DPF_STREAM_ALGORITHM_INIT_ERROR(Object arg0) {
        return messageFactory.getMessage("warning.grizzly.http.dpf.stream-algorithm.init.error", arg0);
    }

    /**
     * GRIZZLY0022: Unable to instantiate Algorithm: {0}.
     * 
     */
    public static String WARNING_GRIZZLY_HTTP_DPF_STREAM_ALGORITHM_INIT_ERROR(Object arg0) {
        return localizer.localize(localizableWARNING_GRIZZLY_HTTP_DPF_STREAM_ALGORITHM_INIT_ERROR(arg0));
    }

    public static Localizable localizableWARNING_GRIZZLY_CONFIG_SSL_GENERAL_CONFIG_ERROR() {
        return messageFactory.getMessage("warning.grizzly.config.ssl.general.config.error");
    }

    /**
     * GRIZZLY0007: SSL support could not be configured!
     * 
     */
    public static String WARNING_GRIZZLY_CONFIG_SSL_GENERAL_CONFIG_ERROR() {
        return localizer.localize(localizableWARNING_GRIZZLY_CONFIG_SSL_GENERAL_CONFIG_ERROR());
    }

    public static Localizable localizableSEVERE_GRIZZLY_HTTP_GWS_IO_ERROR() {
        return messageFactory.getMessage("severe.grizzly.http.gws.io.error");
    }

    /**
     * GRIZZLY0050: I/O error sending 404 to user agent.
     * 
     */
    public static String SEVERE_GRIZZLY_HTTP_GWS_IO_ERROR() {
        return localizer.localize(localizableSEVERE_GRIZZLY_HTTP_GWS_IO_ERROR());
    }

    public static Localizable localizableSEVERE_GRIZZLY_HTTP_PROCESSOR_TASK_CREATE_REQUEST_ERROR() {
        return messageFactory.getMessage("severe.grizzly.http.processor-task.create.request.error");
    }

    /**
     * GRIZZLY0042: Error creating internal request.
     * 
     */
    public static String SEVERE_GRIZZLY_HTTP_PROCESSOR_TASK_CREATE_REQUEST_ERROR() {
        return localizer.localize(localizableSEVERE_GRIZZLY_HTTP_PROCESSOR_TASK_CREATE_REQUEST_ERROR());
    }

    public static Localizable localizableSEVERE_GRIZZLY_HTTP_PROCESSOR_TASK_REQUEST_URI_TOO_LARGE_ERROR() {
        return messageFactory.getMessage("severe.grizzly.http.processor-task.request.uri.too-large.error");
    }

    /**
     * GRIZZLY0039: Request URI is too large.
     * 
     */
    public static String SEVERE_GRIZZLY_HTTP_PROCESSOR_TASK_REQUEST_URI_TOO_LARGE_ERROR() {
        return localizer.localize(localizableSEVERE_GRIZZLY_HTTP_PROCESSOR_TASK_REQUEST_URI_TOO_LARGE_ERROR());
    }

    public static Localizable localizableSEVERE_GRIZZLY_COMET_ENGINE_INVALID_NOTIFICATION_HANDLER_ERROR(Object arg0) {
        return messageFactory.getMessage("severe.grizzly.comet.engine.invalid.notification-handler.error", arg0);
    }

    /**
     * GRIZZLY0015: Invalid NotificationHandler class [{0}].  Default NotificationHandler will be used instead.
     * 
     */
    public static String SEVERE_GRIZZLY_COMET_ENGINE_INVALID_NOTIFICATION_HANDLER_ERROR(Object arg0) {
        return localizer.localize(localizableSEVERE_GRIZZLY_COMET_ENGINE_INVALID_NOTIFICATION_HANDLER_ERROR(arg0));
    }

    public static Localizable localizableWARNING_GRIZZLY_HTTP_IDLE_THREAD_INTERRUPT(Object arg0) {
        return messageFactory.getMessage("warning.grizzly.http.idle.thread.interrupt", arg0);
    }

    /**
     * GRIZZLY0023: Interrupting idle Thread: {0}.
     * 
     */
    public static String WARNING_GRIZZLY_HTTP_IDLE_THREAD_INTERRUPT(Object arg0) {
        return localizer.localize(localizableWARNING_GRIZZLY_HTTP_IDLE_THREAD_INTERRUPT(arg0));
    }

    public static Localizable localizableWARNING_GRIZZLY_CONNECTOR_HANDLER_TCPNODELAY_EXCEPTION() {
        return messageFactory.getMessage("warning.grizzly.connector-handler.tcpnodelay.exception");
    }

    /**
     * GRIZZLY0004: setTcpNoDelay exception
     * 
     */
    public static String WARNING_GRIZZLY_CONNECTOR_HANDLER_TCPNODELAY_EXCEPTION() {
        return localizer.localize(localizableWARNING_GRIZZLY_CONNECTOR_HANDLER_TCPNODELAY_EXCEPTION());
    }

    public static Localizable localizableWARNING_GRIZZLY_HTTP_SERVLET_ATTRIBUTE_LISTENER_REMOVE_ERROR(Object arg0, Object arg1) {
        return messageFactory.getMessage("warning.grizzly.http.servlet.attribute.listener.remove.error", arg0, arg1);
    }

    /**
     * GRIZZLY0055: Exception invoking attributeRemoved() on {0}: {1}.
     * 
     */
    public static String WARNING_GRIZZLY_HTTP_SERVLET_ATTRIBUTE_LISTENER_REMOVE_ERROR(Object arg0, Object arg1) {
        return localizer.localize(localizableWARNING_GRIZZLY_HTTP_SERVLET_ATTRIBUTE_LISTENER_REMOVE_ERROR(arg0, arg1));
    }

    public static Localizable localizableSEVERE_GRIZZLY_UTILS_SSL_JSSE_INVALID_SSL_CONF(Object arg0) {
        return messageFactory.getMessage("severe.grizzly.utils.ssl.jsse.invalid_ssl_conf", arg0);
    }

    /**
     * GRIZZLY0078: SSL configuration is invalid due to {0}
     * 
     */
    public static String SEVERE_GRIZZLY_UTILS_SSL_JSSE_INVALID_SSL_CONF(Object arg0) {
        return localizer.localize(localizableSEVERE_GRIZZLY_UTILS_SSL_JSSE_INVALID_SSL_CONF(arg0));
    }

}
