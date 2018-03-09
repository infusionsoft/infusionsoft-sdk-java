# infusionsoft-sdk-java

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.infusionsoft</groupId>
    <artifactId>infusionsoft-sdk-java</artifactId>
    <version>0.0.1</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.infusionsoft:infusionsoft-sdk-java:0.0.1"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/infusionsoft-sdk-java-0.0.1.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.infusionsoft.*;
import com.infusionsoft.auth.*;
import com.infusionsoft.model.*;
import com.infusionsoft.api.AccountInfoApi;

import java.io.File;
import java.util.*;

public class AccountInfoApiExample {

    public static void main(String[] args) {
        
        AccountInfoApi apiInstance = new AccountInfoApi();
        try {
            InfusionsoftAccountProfile result = apiInstance.getAccountProfileUsingGET();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountInfoApi#getAccountProfileUsingGET");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.infusiontest.com/crm/rest/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountInfoApi* | [**getAccountProfileUsingGET**](docs/AccountInfoApi.md#getAccountProfileUsingGET) | **GET** /account/profile | Retrieve account profile
*AffiliateApi* | [**searchCommissionsUsingGET**](docs/AffiliateApi.md#searchCommissionsUsingGET) | **GET** /affiliates/commissions | Retrieve Commissions
*AppointmentApi* | [**createAppointmentUsingPOST**](docs/AppointmentApi.md#createAppointmentUsingPOST) | **POST** /appointments | Create an Appointment
*AppointmentApi* | [**deleteAppointmentUsingDELETE**](docs/AppointmentApi.md#deleteAppointmentUsingDELETE) | **DELETE** /appointments/{appointmentId} | Delete an Appointment
*AppointmentApi* | [**getAppointmentUsingGET**](docs/AppointmentApi.md#getAppointmentUsingGET) | **GET** /appointments/{appointmentId} | Retrieve an Appointment
*AppointmentApi* | [**listAppointmentsUsingGET**](docs/AppointmentApi.md#listAppointmentsUsingGET) | **GET** /appointments | List Appointments
*AppointmentApi* | [**updateAppointmentUsingPUT**](docs/AppointmentApi.md#updateAppointmentUsingPUT) | **PUT** /appointments/{appointmentId} | Replace an Appointment
*AppointmentApi* | [**updatePropertiesOnAppointmentUsingPATCH**](docs/AppointmentApi.md#updatePropertiesOnAppointmentUsingPATCH) | **PATCH** /appointments/{appointmentId} | Update an Appointment
*CampaignApi* | [**addContactToCampaignSequenceUsingPOST**](docs/CampaignApi.md#addContactToCampaignSequenceUsingPOST) | **POST** /campaigns/{campaignId}/sequences/{sequenceId}/contacts/{contactId} | Add to Campaign Sequence
*CampaignApi* | [**addContactsToCampaignSequenceUsingPOST**](docs/CampaignApi.md#addContactsToCampaignSequenceUsingPOST) | **POST** /campaigns/{campaignId}/sequences/{sequenceId}/contacts | Add Multiple to Campaign Sequence
*CampaignApi* | [**getCampaignUsingGET**](docs/CampaignApi.md#getCampaignUsingGET) | **GET** /campaigns/{campaignId} | Retrieve a Campaign
*CampaignApi* | [**listCampaignsUsingGET**](docs/CampaignApi.md#listCampaignsUsingGET) | **GET** /campaigns | List Campaigns
*CampaignApi* | [**removeContactFromCampaignSequenceUsingDELETE**](docs/CampaignApi.md#removeContactFromCampaignSequenceUsingDELETE) | **DELETE** /campaigns/{campaignId}/sequences/{sequenceId}/contacts/{contactId} | Remove from Campaign Sequence
*CampaignApi* | [**removeContactsFromCampaignSequenceUsingDELETE**](docs/CampaignApi.md#removeContactsFromCampaignSequenceUsingDELETE) | **DELETE** /campaigns/{campaignId}/sequences/{sequenceId}/contacts | Remove Multiple from Campaign Sequence
*ContactApi* | [**applyTagsToContactIdUsingPOST**](docs/ContactApi.md#applyTagsToContactIdUsingPOST) | **POST** /contacts/{contactId}/tags | Apply Tags
*ContactApi* | [**createContactUsingPOST**](docs/ContactApi.md#createContactUsingPOST) | **POST** /contacts | Create a Contact
*ContactApi* | [**createEmailForContactUsingPOST**](docs/ContactApi.md#createEmailForContactUsingPOST) | **POST** /contacts/{contactId}/emails | Create an Email Record
*ContactApi* | [**createOrUpdateContactUsingPUT**](docs/ContactApi.md#createOrUpdateContactUsingPUT) | **PUT** /contacts | Create or Update a Contact
*ContactApi* | [**deleteContactUsingDELETE**](docs/ContactApi.md#deleteContactUsingDELETE) | **DELETE** /contacts/{contactId} | Delete a Contact
*ContactApi* | [**getContactUsingGET**](docs/ContactApi.md#getContactUsingGET) | **GET** /contacts/{id} | Retrieve a Contact
*ContactApi* | [**listAppliedTagsUsingGET**](docs/ContactApi.md#listAppliedTagsUsingGET) | **GET** /contacts/{contactId}/tags | List Applied Tags
*ContactApi* | [**listContactsUsingGET**](docs/ContactApi.md#listContactsUsingGET) | **GET** /contacts | List Contacts
*ContactApi* | [**listCustomFieldsUsingGET**](docs/ContactApi.md#listCustomFieldsUsingGET) | **GET** /contactCustomFields | List Contact Custom Fields
*ContactApi* | [**listEmailsForContactUsingGET**](docs/ContactApi.md#listEmailsForContactUsingGET) | **GET** /contacts/{contactId}/emails | List Emails
*ContactApi* | [**removeTagsFromContactUsingDELETE**](docs/ContactApi.md#removeTagsFromContactUsingDELETE) | **DELETE** /contacts/{contactId}/tags/{tagId} | Remove Applied Tag
*ContactApi* | [**removeTagsFromContactUsingDELETE1**](docs/ContactApi.md#removeTagsFromContactUsingDELETE1) | **DELETE** /contacts/{contactId}/tags | Remove Applied Tags
*ContactApi* | [**updatePropertiesOnContactUsingPATCH**](docs/ContactApi.md#updatePropertiesOnContactUsingPATCH) | **PATCH** /contacts/{contactId} | Update a Contact
*ECommerceApi* | [**getOrderUsingGET**](docs/ECommerceApi.md#getOrderUsingGET) | **GET** /orders/{orderId} | Retrieve an Order
*ECommerceApi* | [**getTransactionUsingGET**](docs/ECommerceApi.md#getTransactionUsingGET) | **GET** /transactions/{transactionId} | Retrieve a Transaction
*ECommerceApi* | [**listOrdersUsingGET**](docs/ECommerceApi.md#listOrdersUsingGET) | **GET** /orders | List Orders
*ECommerceApi* | [**listTransactionsForOrderUsingGET**](docs/ECommerceApi.md#listTransactionsForOrderUsingGET) | **GET** /orders/{orderId}/transactions | Retrieve Order Transactions
*ECommerceApi* | [**listTransactionsUsingGET**](docs/ECommerceApi.md#listTransactionsUsingGET) | **GET** /transactions | List Transactions
*EmailApi* | [**createEmailUsingPOST**](docs/EmailApi.md#createEmailUsingPOST) | **POST** /emails | Create an Email Record
*EmailApi* | [**createEmailsUsingPOST**](docs/EmailApi.md#createEmailsUsingPOST) | **POST** /emails/sync | Create a set of Email Records
*EmailApi* | [**deleteEmailUsingDELETE**](docs/EmailApi.md#deleteEmailUsingDELETE) | **DELETE** /emails/{id} | Delete an Email Record
*EmailApi* | [**deleteEmailsUsingPOST**](docs/EmailApi.md#deleteEmailsUsingPOST) | **POST** /emails/unsync | Un-sync a batch of Email Records
*EmailApi* | [**getEmailUsingGET**](docs/EmailApi.md#getEmailUsingGET) | **GET** /emails/{id} | Retrieve an Email
*EmailApi* | [**listEmailsUsingGET**](docs/EmailApi.md#listEmailsUsingGET) | **GET** /emails | List Emails
*EmailApi* | [**updateEmailUsingPUT**](docs/EmailApi.md#updateEmailUsingPUT) | **PUT** /emails/{id} | Update an Email Record
*FileApi* | [**createFileUsingPOST**](docs/FileApi.md#createFileUsingPOST) | **POST** /files | Upload File
*FileApi* | [**deleteFileUsingDELETE**](docs/FileApi.md#deleteFileUsingDELETE) | **DELETE** /files/{fileId} | Delete File
*FileApi* | [**getFileUsingGET**](docs/FileApi.md#getFileUsingGET) | **GET** /files/{fileId} | Retrieve File
*FileApi* | [**listFilesUsingGET**](docs/FileApi.md#listFilesUsingGET) | **GET** /files | List Files
*FileApi* | [**updateFileUsingPUT**](docs/FileApi.md#updateFileUsingPUT) | **PUT** /files/{fileId} | Replace File
*OpportunityApi* | [**createOpportunityUsingPOST**](docs/OpportunityApi.md#createOpportunityUsingPOST) | **POST** /opportunities | Create an Opportunity
*OpportunityApi* | [**getOpportunityUsingGET**](docs/OpportunityApi.md#getOpportunityUsingGET) | **GET** /opportunities/{opportunityId} | Retrieve an Opportunity
*OpportunityApi* | [**listOpportunitiesUsingGET**](docs/OpportunityApi.md#listOpportunitiesUsingGET) | **GET** /opportunities | List Opportunities
*OpportunityApi* | [**listOpportunityStagePipelinesUsingGET**](docs/OpportunityApi.md#listOpportunityStagePipelinesUsingGET) | **GET** /opportunity/stage_pipeline | List Opportunity Stage Pipeline
*OpportunityApi* | [**updateOpportunityUsingPUT**](docs/OpportunityApi.md#updateOpportunityUsingPUT) | **PUT** /opportunities | Replace an Opportunity
*OpportunityApi* | [**updateProperitesOnOpportunityUsingPATCH**](docs/OpportunityApi.md#updateProperitesOnOpportunityUsingPATCH) | **PATCH** /opportunities/{opportunityId} | Update an Opportunity
*ProductApi* | [**getProductUsingGET**](docs/ProductApi.md#getProductUsingGET) | **GET** /products/{productId} | Retrieve a Product
*ProductApi* | [**listProductsFromSyncTokenUsingGET**](docs/ProductApi.md#listProductsFromSyncTokenUsingGET) | **GET** /products/sync | Retrieve Synced Products
*ProductApi* | [**listProductsUsingGET**](docs/ProductApi.md#listProductsUsingGET) | **GET** /products/search | List Products
*RestHooksApi* | [**createAHookSubscription**](docs/RestHooksApi.md#createAHookSubscription) | **POST** /hooks | Create a Hook Subscription
*RestHooksApi* | [**deleteAHookSubscription**](docs/RestHooksApi.md#deleteAHookSubscription) | **DELETE** /hooks/{key} | Delete a Hook Subscription
*RestHooksApi* | [**listHookEventTypes**](docs/RestHooksApi.md#listHookEventTypes) | **GET** /hooks/event_keys | List Hook Event Types
*RestHooksApi* | [**listStoredHookSubscriptions**](docs/RestHooksApi.md#listStoredHookSubscriptions) | **GET** /hooks | List Stored Hook Subscriptions
*RestHooksApi* | [**retrieveAHookSubscription**](docs/RestHooksApi.md#retrieveAHookSubscription) | **GET** /hooks/{key} | Retrieve a Hook Subscription
*RestHooksApi* | [**updateAHookSubscription**](docs/RestHooksApi.md#updateAHookSubscription) | **PUT** /hooks/{key} | Update a Hook Subscription
*RestHooksApi* | [**verifyAHookSubscription**](docs/RestHooksApi.md#verifyAHookSubscription) | **POST** /hooks/{key}/verify | Verify a Hook Subscription
*RestHooksApi* | [**verifyAHookSubscriptionDelayed**](docs/RestHooksApi.md#verifyAHookSubscriptionDelayed) | **POST** /hooks/{key}/delayedVerify | Verify a Hook Subscription, Delayed
*TagsApi* | [**applyTagToContactIdsUsingPOST**](docs/TagsApi.md#applyTagToContactIdsUsingPOST) | **POST** /tags/{tagId}/contacts | Apply Tag to Contacts
*TagsApi* | [**createTagCategoryUsingPOST**](docs/TagsApi.md#createTagCategoryUsingPOST) | **POST** /tags/categories | Create Tag Category
*TagsApi* | [**createTagUsingPOST**](docs/TagsApi.md#createTagUsingPOST) | **POST** /tags | Create Tag
*TagsApi* | [**getTagUsingGET**](docs/TagsApi.md#getTagUsingGET) | **GET** /tags/{id} | Retrieve a Tag
*TagsApi* | [**listContactsForTagIdUsingGET**](docs/TagsApi.md#listContactsForTagIdUsingGET) | **GET** /tags/{tagId}/contacts | List Tagged Contacts
*TagsApi* | [**listTagsUsingGET**](docs/TagsApi.md#listTagsUsingGET) | **GET** /tags | List Tags
*TagsApi* | [**removeTagFromContactIdUsingDELETE**](docs/TagsApi.md#removeTagFromContactIdUsingDELETE) | **DELETE** /tags/{tagId}/contacts/{contactId} | Remove Tag from Contact
*TagsApi* | [**removeTagFromContactIdsUsingDELETE**](docs/TagsApi.md#removeTagFromContactIdsUsingDELETE) | **DELETE** /tags/{tagId}/contacts | Remove Tag from Contacts
*TaskApi* | [**createTaskUsingPOST**](docs/TaskApi.md#createTaskUsingPOST) | **POST** /tasks | Create a Task
*TaskApi* | [**deleteTaskUsingDELETE**](docs/TaskApi.md#deleteTaskUsingDELETE) | **DELETE** /tasks/{taskId} | Delete a Task
*TaskApi* | [**getTaskUsingGET**](docs/TaskApi.md#getTaskUsingGET) | **GET** /tasks/{taskId} | Retrieve a Task
*TaskApi* | [**listTasksForCurrentUserUsingGET**](docs/TaskApi.md#listTasksForCurrentUserUsingGET) | **GET** /tasks/search | Search Tasks
*TaskApi* | [**listTasksUsingGET**](docs/TaskApi.md#listTasksUsingGET) | **GET** /tasks | List Tasks
*TaskApi* | [**updatePropertiesOnTaskUsingPATCH**](docs/TaskApi.md#updatePropertiesOnTaskUsingPATCH) | **PATCH** /tasks/{taskId} | Update a Task
*TaskApi* | [**updateTaskUsingPUT**](docs/TaskApi.md#updateTaskUsingPUT) | **PUT** /tasks/{taskId} | Replace a Task
*UserInfoApi* | [**getUserInfoUsingGET**](docs/UserInfoApi.md#getUserInfoUsingGET) | **GET** /oauth/connect/userinfo | Retrieve User Info


## Documentation for Models

 - [InfusionsoftAccountProfile](docs/InfusionsoftAccountProfile.md)
 - [InfusionsoftAddress](docs/InfusionsoftAddress.md)
 - [InfusionsoftAffiliateCommission](docs/InfusionsoftAffiliateCommission.md)
 - [InfusionsoftAffiliateCommissionList](docs/InfusionsoftAffiliateCommissionList.md)
 - [InfusionsoftAppointment](docs/InfusionsoftAppointment.md)
 - [InfusionsoftAppointmentList](docs/InfusionsoftAppointmentList.md)
 - [InfusionsoftBasicContact](docs/InfusionsoftBasicContact.md)
 - [InfusionsoftCampaign](docs/InfusionsoftCampaign.md)
 - [InfusionsoftCampaignLandingPageNodeDTO](docs/InfusionsoftCampaignLandingPageNodeDTO.md)
 - [InfusionsoftCampaignList](docs/InfusionsoftCampaignList.md)
 - [InfusionsoftCampaignNodeDTO](docs/InfusionsoftCampaignNodeDTO.md)
 - [InfusionsoftCheckListItemDetails](docs/InfusionsoftCheckListItemDetails.md)
 - [InfusionsoftCompany](docs/InfusionsoftCompany.md)
 - [InfusionsoftContactList](docs/InfusionsoftContactList.md)
 - [InfusionsoftContactTag](docs/InfusionsoftContactTag.md)
 - [InfusionsoftContactTagList](docs/InfusionsoftContactTagList.md)
 - [InfusionsoftCustomFieldMetaData](docs/InfusionsoftCustomFieldMetaData.md)
 - [InfusionsoftCustomFieldOption](docs/InfusionsoftCustomFieldOption.md)
 - [InfusionsoftCustomFieldValue](docs/InfusionsoftCustomFieldValue.md)
 - [InfusionsoftEmailAddress](docs/InfusionsoftEmailAddress.md)
 - [InfusionsoftEmailSentCreate](docs/InfusionsoftEmailSentCreate.md)
 - [InfusionsoftEmailSentCreateList](docs/InfusionsoftEmailSentCreateList.md)
 - [InfusionsoftEmailSentQueryResult](docs/InfusionsoftEmailSentQueryResult.md)
 - [InfusionsoftEmailSentQueryResultList](docs/InfusionsoftEmailSentQueryResultList.md)
 - [InfusionsoftEmailSentQueryResultWithContent](docs/InfusionsoftEmailSentQueryResultWithContent.md)
 - [InfusionsoftEntrylongstring](docs/InfusionsoftEntrylongstring.md)
 - [InfusionsoftError](docs/InfusionsoftError.md)
 - [InfusionsoftFaxNumber](docs/InfusionsoftFaxNumber.md)
 - [InfusionsoftFileDescriptor](docs/InfusionsoftFileDescriptor.md)
 - [InfusionsoftFileInformation](docs/InfusionsoftFileInformation.md)
 - [InfusionsoftFileList](docs/InfusionsoftFileList.md)
 - [InfusionsoftFileUpload](docs/InfusionsoftFileUpload.md)
 - [InfusionsoftFullContact](docs/InfusionsoftFullContact.md)
 - [InfusionsoftGoal](docs/InfusionsoftGoal.md)
 - [InfusionsoftHistoricalCounts](docs/InfusionsoftHistoricalCounts.md)
 - [InfusionsoftItem](docs/InfusionsoftItem.md)
 - [InfusionsoftOpportunity](docs/InfusionsoftOpportunity.md)
 - [InfusionsoftOpportunityContact](docs/InfusionsoftOpportunityContact.md)
 - [InfusionsoftOpportunityList](docs/InfusionsoftOpportunityList.md)
 - [InfusionsoftOrder](docs/InfusionsoftOrder.md)
 - [InfusionsoftOrderContactDetails](docs/InfusionsoftOrderContactDetails.md)
 - [InfusionsoftOrderItem](docs/InfusionsoftOrderItem.md)
 - [InfusionsoftOrderList](docs/InfusionsoftOrderList.md)
 - [InfusionsoftPhoneNumber](docs/InfusionsoftPhoneNumber.md)
 - [InfusionsoftProduct](docs/InfusionsoftProduct.md)
 - [InfusionsoftProductList](docs/InfusionsoftProductList.md)
 - [InfusionsoftProductOption](docs/InfusionsoftProductOption.md)
 - [InfusionsoftProductOptionValue](docs/InfusionsoftProductOptionValue.md)
 - [InfusionsoftProductStatus](docs/InfusionsoftProductStatus.md)
 - [InfusionsoftProductStatusList](docs/InfusionsoftProductStatusList.md)
 - [InfusionsoftRelationship](docs/InfusionsoftRelationship.md)
 - [InfusionsoftRestHook](docs/InfusionsoftRestHook.md)
 - [InfusionsoftRestHookRequest](docs/InfusionsoftRestHookRequest.md)
 - [InfusionsoftSalesPipeline](docs/InfusionsoftSalesPipeline.md)
 - [InfusionsoftSequence](docs/InfusionsoftSequence.md)
 - [InfusionsoftSequencePath](docs/InfusionsoftSequencePath.md)
 - [InfusionsoftSetOfIds](docs/InfusionsoftSetOfIds.md)
 - [InfusionsoftShippingInformation](docs/InfusionsoftShippingInformation.md)
 - [InfusionsoftSimpleOpportunityStage](docs/InfusionsoftSimpleOpportunityStage.md)
 - [InfusionsoftSimpleProduct](docs/InfusionsoftSimpleProduct.md)
 - [InfusionsoftSimpleTag](docs/InfusionsoftSimpleTag.md)
 - [InfusionsoftSimpleUser](docs/InfusionsoftSimpleUser.md)
 - [InfusionsoftSocialAccount](docs/InfusionsoftSocialAccount.md)
 - [InfusionsoftStackTraceElement](docs/InfusionsoftStackTraceElement.md)
 - [InfusionsoftStageDetails](docs/InfusionsoftStageDetails.md)
 - [InfusionsoftSubscriptionPlan](docs/InfusionsoftSubscriptionPlan.md)
 - [InfusionsoftTagCategory](docs/InfusionsoftTagCategory.md)
 - [InfusionsoftTagCategoryReference](docs/InfusionsoftTagCategoryReference.md)
 - [InfusionsoftTagId](docs/InfusionsoftTagId.md)
 - [InfusionsoftTagList](docs/InfusionsoftTagList.md)
 - [InfusionsoftTagModel](docs/InfusionsoftTagModel.md)
 - [InfusionsoftTaggedContact](docs/InfusionsoftTaggedContact.md)
 - [InfusionsoftTaggedContactList](docs/InfusionsoftTaggedContactList.md)
 - [InfusionsoftTask](docs/InfusionsoftTask.md)
 - [InfusionsoftTaskList](docs/InfusionsoftTaskList.md)
 - [InfusionsoftThrowable](docs/InfusionsoftThrowable.md)
 - [InfusionsoftTransaction](docs/InfusionsoftTransaction.md)
 - [InfusionsoftTransactionList](docs/InfusionsoftTransactionList.md)
 - [InfusionsoftUpsertContact](docs/InfusionsoftUpsertContact.md)
 - [InfusionsoftUserInfoDTO](docs/InfusionsoftUserInfoDTO.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### oauth2

- **Type**: OAuth
- **Flow**: accessCode
- **Authorization URL**: https://accounts.infusiontest.com/app/oauth/authorize
- **Scopes**: N/A


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



