/**
 * Copyright (c) 2010-2020 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.tinkerforge.internal.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.openhab.binding.tinkerforge.internal.model.ModelPackage;
import org.openhab.binding.tinkerforge.internal.model.TFObjectTemperatureConfiguration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TF Object Temperature Configuration</b></em>'.
 *
 * @author Theo Weiss
 * @since 1.5.0
 *        <!-- end-user-doc -->
 *        <p>
 *        The following features are implemented:
 *        </p>
 *        <ul>
 *        <li>
 *        {@link org.openhab.binding.tinkerforge.internal.model.impl.TFObjectTemperatureConfigurationImpl#getEmissivity
 *        <em>Emissivity</em>}</li>
 *        </ul>
 *
 * @generated
 */
public class TFObjectTemperatureConfigurationImpl extends TFBaseConfigurationImpl
        implements TFObjectTemperatureConfiguration {
    /**
     * The default value of the '{@link #getEmissivity() <em>Emissivity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getEmissivity()
     * @generated
     * @ordered
     */
    protected static final int EMISSIVITY_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getEmissivity() <em>Emissivity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getEmissivity()
     * @generated
     * @ordered
     */
    protected int emissivity = EMISSIVITY_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected TFObjectTemperatureConfigurationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ModelPackage.Literals.TF_OBJECT_TEMPERATURE_CONFIGURATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public int getEmissivity() {
        return emissivity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setEmissivity(int newEmissivity) {
        int oldEmissivity = emissivity;
        emissivity = newEmissivity;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    ModelPackage.TF_OBJECT_TEMPERATURE_CONFIGURATION__EMISSIVITY, oldEmissivity, emissivity));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ModelPackage.TF_OBJECT_TEMPERATURE_CONFIGURATION__EMISSIVITY:
                return getEmissivity();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case ModelPackage.TF_OBJECT_TEMPERATURE_CONFIGURATION__EMISSIVITY:
                setEmissivity((Integer) newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case ModelPackage.TF_OBJECT_TEMPERATURE_CONFIGURATION__EMISSIVITY:
                setEmissivity(EMISSIVITY_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case ModelPackage.TF_OBJECT_TEMPERATURE_CONFIGURATION__EMISSIVITY:
                return emissivity != EMISSIVITY_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy())
            return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (emissivity: ");
        result.append(emissivity);
        result.append(')');
        return result.toString();
    }

} // TFObjectTemperatureConfigurationImpl
