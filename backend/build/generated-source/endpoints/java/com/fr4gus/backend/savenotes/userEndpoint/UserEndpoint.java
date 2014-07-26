/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2014-07-22 21:53:01 UTC)
 * on 2014-07-26 at 05:02:58 UTC 
 * Modify at your own risk.
 */

package com.fr4gus.backend.savenotes.userEndpoint;

/**
 * Service definition for UserEndpoint (v1).
 *
 * <p>
 * This is an API
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link UserEndpointRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class UserEndpoint extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.19.0 of the userEndpoint library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://myApplicationId.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "userEndpoint/v1/";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public UserEndpoint(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  UserEndpoint(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * Create a request for the method "findUser".
   *
   * This request holds the parameters needed by the userEndpoint server.  After setting any optional
   * parameters, call the {@link FindUser#execute()} method to invoke the remote operation.
   *
   * @param deviceId
   * @return the request
   */
  public FindUser findUser(java.lang.String deviceId) throws java.io.IOException {
    FindUser result = new FindUser(deviceId);
    initialize(result);
    return result;
  }

  public class FindUser extends UserEndpointRequest<com.fr4gus.backend.savenotes.userEndpoint.model.User> {

    private static final String REST_PATH = "findUser/{deviceId}";

    /**
     * Create a request for the method "findUser".
     *
     * This request holds the parameters needed by the the userEndpoint server.  After setting any
     * optional parameters, call the {@link FindUser#execute()} method to invoke the remote operation.
     * <p> {@link
     * FindUser#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param deviceId
     * @since 1.13
     */
    protected FindUser(java.lang.String deviceId) {
      super(UserEndpoint.this, "POST", REST_PATH, null, com.fr4gus.backend.savenotes.userEndpoint.model.User.class);
      this.deviceId = com.google.api.client.util.Preconditions.checkNotNull(deviceId, "Required parameter deviceId must be specified.");
    }

    @Override
    public FindUser setAlt(java.lang.String alt) {
      return (FindUser) super.setAlt(alt);
    }

    @Override
    public FindUser setFields(java.lang.String fields) {
      return (FindUser) super.setFields(fields);
    }

    @Override
    public FindUser setKey(java.lang.String key) {
      return (FindUser) super.setKey(key);
    }

    @Override
    public FindUser setOauthToken(java.lang.String oauthToken) {
      return (FindUser) super.setOauthToken(oauthToken);
    }

    @Override
    public FindUser setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (FindUser) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public FindUser setQuotaUser(java.lang.String quotaUser) {
      return (FindUser) super.setQuotaUser(quotaUser);
    }

    @Override
    public FindUser setUserIp(java.lang.String userIp) {
      return (FindUser) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String deviceId;

    /**

     */
    public java.lang.String getDeviceId() {
      return deviceId;
    }

    public FindUser setDeviceId(java.lang.String deviceId) {
      this.deviceId = deviceId;
      return this;
    }

    @Override
    public FindUser set(String parameterName, Object value) {
      return (FindUser) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "getUser".
   *
   * This request holds the parameters needed by the userEndpoint server.  After setting any optional
   * parameters, call the {@link GetUser#execute()} method to invoke the remote operation.
   *
   * @param id
   * @return the request
   */
  public GetUser getUser(java.lang.Long id) throws java.io.IOException {
    GetUser result = new GetUser(id);
    initialize(result);
    return result;
  }

  public class GetUser extends UserEndpointRequest<com.fr4gus.backend.savenotes.userEndpoint.model.User> {

    private static final String REST_PATH = "user/{id}";

    /**
     * Create a request for the method "getUser".
     *
     * This request holds the parameters needed by the the userEndpoint server.  After setting any
     * optional parameters, call the {@link GetUser#execute()} method to invoke the remote operation.
     * <p> {@link
     * GetUser#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
     * be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected GetUser(java.lang.Long id) {
      super(UserEndpoint.this, "GET", REST_PATH, null, com.fr4gus.backend.savenotes.userEndpoint.model.User.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public GetUser setAlt(java.lang.String alt) {
      return (GetUser) super.setAlt(alt);
    }

    @Override
    public GetUser setFields(java.lang.String fields) {
      return (GetUser) super.setFields(fields);
    }

    @Override
    public GetUser setKey(java.lang.String key) {
      return (GetUser) super.setKey(key);
    }

    @Override
    public GetUser setOauthToken(java.lang.String oauthToken) {
      return (GetUser) super.setOauthToken(oauthToken);
    }

    @Override
    public GetUser setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetUser) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetUser setQuotaUser(java.lang.String quotaUser) {
      return (GetUser) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetUser setUserIp(java.lang.String userIp) {
      return (GetUser) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Long id;

    /**

     */
    public java.lang.Long getId() {
      return id;
    }

    public GetUser setId(java.lang.Long id) {
      this.id = id;
      return this;
    }

    @Override
    public GetUser set(String parameterName, Object value) {
      return (GetUser) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "insertUser".
   *
   * This request holds the parameters needed by the userEndpoint server.  After setting any optional
   * parameters, call the {@link InsertUser#execute()} method to invoke the remote operation.
   *
   * @param content the {@link com.fr4gus.backend.savenotes.userEndpoint.model.User}
   * @return the request
   */
  public InsertUser insertUser(com.fr4gus.backend.savenotes.userEndpoint.model.User content) throws java.io.IOException {
    InsertUser result = new InsertUser(content);
    initialize(result);
    return result;
  }

  public class InsertUser extends UserEndpointRequest<com.fr4gus.backend.savenotes.userEndpoint.model.User> {

    private static final String REST_PATH = "user";

    /**
     * Create a request for the method "insertUser".
     *
     * This request holds the parameters needed by the the userEndpoint server.  After setting any
     * optional parameters, call the {@link InsertUser#execute()} method to invoke the remote
     * operation. <p> {@link
     * InsertUser#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param content the {@link com.fr4gus.backend.savenotes.userEndpoint.model.User}
     * @since 1.13
     */
    protected InsertUser(com.fr4gus.backend.savenotes.userEndpoint.model.User content) {
      super(UserEndpoint.this, "POST", REST_PATH, content, com.fr4gus.backend.savenotes.userEndpoint.model.User.class);
    }

    @Override
    public InsertUser setAlt(java.lang.String alt) {
      return (InsertUser) super.setAlt(alt);
    }

    @Override
    public InsertUser setFields(java.lang.String fields) {
      return (InsertUser) super.setFields(fields);
    }

    @Override
    public InsertUser setKey(java.lang.String key) {
      return (InsertUser) super.setKey(key);
    }

    @Override
    public InsertUser setOauthToken(java.lang.String oauthToken) {
      return (InsertUser) super.setOauthToken(oauthToken);
    }

    @Override
    public InsertUser setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (InsertUser) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public InsertUser setQuotaUser(java.lang.String quotaUser) {
      return (InsertUser) super.setQuotaUser(quotaUser);
    }

    @Override
    public InsertUser setUserIp(java.lang.String userIp) {
      return (InsertUser) super.setUserIp(userIp);
    }

    @Override
    public InsertUser set(String parameterName, Object value) {
      return (InsertUser) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "listUsers".
   *
   * This request holds the parameters needed by the userEndpoint server.  After setting any optional
   * parameters, call the {@link ListUsers#execute()} method to invoke the remote operation.
   *
   * @return the request
   */
  public ListUsers listUsers() throws java.io.IOException {
    ListUsers result = new ListUsers();
    initialize(result);
    return result;
  }

  public class ListUsers extends UserEndpointRequest<com.fr4gus.backend.savenotes.userEndpoint.model.UserCollection> {

    private static final String REST_PATH = "user/list";

    /**
     * Create a request for the method "listUsers".
     *
     * This request holds the parameters needed by the the userEndpoint server.  After setting any
     * optional parameters, call the {@link ListUsers#execute()} method to invoke the remote
     * operation. <p> {@link
     * ListUsers#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @since 1.13
     */
    protected ListUsers() {
      super(UserEndpoint.this, "GET", REST_PATH, null, com.fr4gus.backend.savenotes.userEndpoint.model.UserCollection.class);
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public ListUsers setAlt(java.lang.String alt) {
      return (ListUsers) super.setAlt(alt);
    }

    @Override
    public ListUsers setFields(java.lang.String fields) {
      return (ListUsers) super.setFields(fields);
    }

    @Override
    public ListUsers setKey(java.lang.String key) {
      return (ListUsers) super.setKey(key);
    }

    @Override
    public ListUsers setOauthToken(java.lang.String oauthToken) {
      return (ListUsers) super.setOauthToken(oauthToken);
    }

    @Override
    public ListUsers setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (ListUsers) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public ListUsers setQuotaUser(java.lang.String quotaUser) {
      return (ListUsers) super.setQuotaUser(quotaUser);
    }

    @Override
    public ListUsers setUserIp(java.lang.String userIp) {
      return (ListUsers) super.setUserIp(userIp);
    }

    @Override
    public ListUsers set(String parameterName, Object value) {
      return (ListUsers) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link UserEndpoint}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
    }

    /** Builds a new instance of {@link UserEndpoint}. */
    @Override
    public UserEndpoint build() {
      return new UserEndpoint(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link UserEndpointRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setUserEndpointRequestInitializer(
        UserEndpointRequestInitializer userendpointRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(userendpointRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
