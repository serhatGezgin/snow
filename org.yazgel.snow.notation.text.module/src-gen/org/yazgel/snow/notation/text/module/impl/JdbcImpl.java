/**
 */
package org.yazgel.snow.notation.text.module.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.yazgel.snow.notation.text.module.Jdbc;
import org.yazgel.snow.notation.text.module.ModulePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Jdbc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.yazgel.snow.notation.text.module.impl.JdbcImpl#getUser <em>User</em>}</li>
 *   <li>{@link org.yazgel.snow.notation.text.module.impl.JdbcImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link org.yazgel.snow.notation.text.module.impl.JdbcImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.yazgel.snow.notation.text.module.impl.JdbcImpl#getDriver <em>Driver</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JdbcImpl extends FeatureImpl implements Jdbc
{
  /**
   * The default value of the '{@link #getUser() <em>User</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUser()
   * @generated
   * @ordered
   */
  protected static final String USER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUser() <em>User</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUser()
   * @generated
   * @ordered
   */
  protected String user = USER_EDEFAULT;

  /**
   * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPassword()
   * @generated
   * @ordered
   */
  protected static final String PASSWORD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPassword()
   * @generated
   * @ordered
   */
  protected String password = PASSWORD_EDEFAULT;

  /**
   * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUrl()
   * @generated
   * @ordered
   */
  protected static final String URL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUrl()
   * @generated
   * @ordered
   */
  protected String url = URL_EDEFAULT;

  /**
   * The default value of the '{@link #getDriver() <em>Driver</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDriver()
   * @generated
   * @ordered
   */
  protected static final String DRIVER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDriver() <em>Driver</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDriver()
   * @generated
   * @ordered
   */
  protected String driver = DRIVER_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JdbcImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ModulePackage.Literals.JDBC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUser()
  {
    return user;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUser(String newUser)
  {
    String oldUser = user;
    user = newUser;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.JDBC__USER, oldUser, user));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPassword()
  {
    return password;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPassword(String newPassword)
  {
    String oldPassword = password;
    password = newPassword;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.JDBC__PASSWORD, oldPassword, password));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUrl()
  {
    return url;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUrl(String newUrl)
  {
    String oldUrl = url;
    url = newUrl;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.JDBC__URL, oldUrl, url));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDriver()
  {
    return driver;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDriver(String newDriver)
  {
    String oldDriver = driver;
    driver = newDriver;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.JDBC__DRIVER, oldDriver, driver));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ModulePackage.JDBC__USER:
        return getUser();
      case ModulePackage.JDBC__PASSWORD:
        return getPassword();
      case ModulePackage.JDBC__URL:
        return getUrl();
      case ModulePackage.JDBC__DRIVER:
        return getDriver();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ModulePackage.JDBC__USER:
        setUser((String)newValue);
        return;
      case ModulePackage.JDBC__PASSWORD:
        setPassword((String)newValue);
        return;
      case ModulePackage.JDBC__URL:
        setUrl((String)newValue);
        return;
      case ModulePackage.JDBC__DRIVER:
        setDriver((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ModulePackage.JDBC__USER:
        setUser(USER_EDEFAULT);
        return;
      case ModulePackage.JDBC__PASSWORD:
        setPassword(PASSWORD_EDEFAULT);
        return;
      case ModulePackage.JDBC__URL:
        setUrl(URL_EDEFAULT);
        return;
      case ModulePackage.JDBC__DRIVER:
        setDriver(DRIVER_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ModulePackage.JDBC__USER:
        return USER_EDEFAULT == null ? user != null : !USER_EDEFAULT.equals(user);
      case ModulePackage.JDBC__PASSWORD:
        return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
      case ModulePackage.JDBC__URL:
        return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
      case ModulePackage.JDBC__DRIVER:
        return DRIVER_EDEFAULT == null ? driver != null : !DRIVER_EDEFAULT.equals(driver);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (user: ");
    result.append(user);
    result.append(", password: ");
    result.append(password);
    result.append(", url: ");
    result.append(url);
    result.append(", driver: ");
    result.append(driver);
    result.append(')');
    return result.toString();
  }

} //JdbcImpl
